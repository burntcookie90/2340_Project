package medicalApp.velociraptors.com;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 * Login GUI for the Medical App
 * @author Vishnu
 *
 */
@SuppressWarnings("serial")
public class LoginGUI extends JPanel {
	@SuppressWarnings("unused")
	private Login login;
	@SuppressWarnings("unused")
	private boolean loginUserSuccessful;
	@SuppressWarnings("unused")
	private boolean loginPassSuccessful;
	@SuppressWarnings("unused")
	private MedAppGUI mag;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private Connection con;
	private MedAppController mac;
	private JButton btnLogin;
	protected int loginCount;

	/**
	 * Constructor for the LoginGUI class. Takes in a controller parameter
	 * @param mac
	 */
	public LoginGUI(final MedAppController mac) {
		loginCount =0;
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
					btnLogin.doClick();
			}
		});
		this.mac = mac;
		setBackground(UIManager.getColor("Button.background"));
		con = mac.makeConnection();
			
		setPreferredSize(new Dimension(800,600));
		initialize();
		
	}
	
	/**
	 * Initializes the GUI
	 */
	private void initialize(){
		setLayout(null);
		{
			//		login = new Login();
			//		setResizable(false);
			//		setAlwaysOnTop(true);
			//		setBounds(100, 100, 451, 225);
			//		getContentPane().setLayout(null);

			JLabel lblSystemLogin = new JLabel("SYSTEM LOGIN");
			lblSystemLogin.setFont(new Font("Tahoma", Font.PLAIN, 28));
			lblSystemLogin.setHorizontalAlignment(SwingConstants.CENTER);
			lblSystemLogin.setBounds(196, 56, 193, 34);
			this.add(lblSystemLogin);

			JLabel lblUsername = new JLabel("Username:");
			lblUsername.setBounds(178, 175, 134, 14);
			this.add(lblUsername);

			txtUsername = new JTextField();
			txtUsername.setBounds(535, 172, 86, 20);
			this.add(txtUsername);
			txtUsername.setColumns(10);

			JLabel lblPassword = new JLabel("Password:");
			lblPassword.setBounds(178, 280, 185, 14);
			this.add(lblPassword);
			
			passwordField = new JPasswordField();
			passwordField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent arg0) {
					if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
						btnLogin.doClick();
				}
			});
			passwordField.setBounds(535, 277, 86, 20);
			this.add(passwordField);

			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String username = txtUsername.getText();
					char[] pass = passwordField.getPassword();
					String password = "";
					String accountType ="";
					int suspended=0;
					String firstName="";
					String lastName="";
					
					for(int i = 0;i<pass.length;i++){
						password += pass[i];
					}
					
					String sql = "SELECT * FROM USER WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'";// AND NOT SUSPENDED=1";
					
					System.err.println(sql);
					
					try {
						Statement stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery(sql);	//request data from database
						ResultSetMetaData rsmd = rs.getMetaData();
						@SuppressWarnings("unused")
						int numCols = rsmd.getColumnCount();
						int rowCount = 0;   
						while ( rs.next() )   
						{   
						    // Process the row.   
						    rowCount++;
						    accountType = rs.getString("USERTYPE");
						    System.err.println("AccountType: " + accountType);
						    suspended = rs.getInt("SUSPENDED");
						    System.err.println("Suspended: "+suspended);
						    firstName = rs.getString("U_FIRSTNAME");
						    lastName = rs.getString("U_LASTNAME");
						    System.err.println(firstName+" "+lastName);
						}
						
						System.err.println("RowCount: " + rowCount);
						
						if(rowCount==1){	//if only one item returned: login success!
							if(suspended==0){
								mac.setLoginSuccess(true);
								loginCount = 0;
								mac.setCurrentUser(username, accountType);

								if(accountType.equals("Doctor")){
									mac.setCurrentCard("DoctorPanel");
									mac.setDoctorInfo(firstName,lastName);
									mac.setDoctorPatientTableModel();
								}
								else if(accountType.equals("Nurse")){
									mac.setCurrentCard("NursePanel");
								}
								else if(accountType.equals("Patient")){
									mac.setCurrentCard("PatientPanel");
									mac.setPatientInfo(firstName,lastName);
								}
								else if(accountType.equals("SysAdmin")){
									mac.setCurrentCard("SysAdminPanel");
									mac.setSysAdminInfo(firstName,lastName);
									mac.setDoctorPatientTableModel();
								}
							}
							else
								JOptionPane.showMessageDialog(null, "Login is SUSPENDED!","Login Error!", JOptionPane.ERROR_MESSAGE);
						}
						else{	//invalid login
							loginCount++;
							if(loginCount>=3){	//suspend user after mult tries
								JOptionPane.showMessageDialog(null, "Login SUSPENDED!","Login Error!", JOptionPane.ERROR_MESSAGE);
								try{
									Statement stmt1 = con.createStatement();
									stmt1.executeUpdate("UPDATE  `USER` SET  `SUSPENDED` =  '1' WHERE  `user`.`USERNAME` =  '"+username+"'");
								}catch(SQLException e){}
							}
							else	// invalid login attempt
								JOptionPane.showMessageDialog(null, "Login INVALID!","Login Error!", JOptionPane.ERROR_MESSAGE);
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			btnLogin.setBounds(213, 483, 134, 23);
			this.add(btnLogin);

			JButton btnCancel = new JButton("Cancel");
			btnCancel.setBounds(494, 483, 178, 23);
			this.add(btnCancel);

			

			JLabel lblNewLabel = new JLabel(new ImageIcon("Hospital-Administration-Velociraptors-Attack.jpg"));
			lblNewLabel.setBounds(673, 22, -1, -1);
			this.add(lblNewLabel);
			
			
		}
	}
	
	/**
	 * Clears the fields
	 */
	public void clearFields(){
		txtUsername.setText("");
		passwordField.setText("");
	}
	
	
}
