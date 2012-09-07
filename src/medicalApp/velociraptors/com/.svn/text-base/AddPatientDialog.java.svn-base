package medicalApp.velociraptors.com;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AddPatientDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JTextField txtSSN;
	private Connection con;
	private JTextField txtDOB_M;
	private JTextField txtDOB_D;
	private JTextField txtDOB_Y;

	/**
	 * Create the dialog.
	 */
	public AddPatientDialog(final MedAppController mac) {
		con = mac.makeConnection();
		setBounds(100, 100, 686, 437);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(37, 29, 114, 14);
		contentPanel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(37, 85, 75, 14);
		contentPanel.add(lblLastName);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(37, 140, 98, 14);
		contentPanel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(37, 202, 98, 14);
		contentPanel.add(lblPassword);
		
		JLabel lblSsn = new JLabel("SSN: ");
		lblSsn.setBounds(37, 313, 46, 14);
		contentPanel.add(lblSsn);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(306, 25, 245, 22);
		contentPanel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(306, 81, 245, 22);
		contentPanel.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(306, 136, 245, 22);
		contentPanel.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(306, 198, 245, 22);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtSSN = new JTextField();
		txtSSN.setBounds(306, 309, 245, 22);
		contentPanel.add(txtSSN);
		txtSSN.setColumns(9);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(37, 252, 46, 14);
		contentPanel.add(lblDob);
		
		txtDOB_M = new JTextField();
		txtDOB_M.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtDOB_M.getText().equals("MM"))
					txtDOB_M.setText("");
			}
		});
		txtDOB_M.setText("MM");
		txtDOB_M.setBounds(306, 254, 66, 22);
		contentPanel.add(txtDOB_M);
		txtDOB_M.setColumns(10);
		
		txtDOB_D = new JTextField();
		txtDOB_D.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtDOB_D.getText().equals("DD"))
					txtDOB_D.setText("");
			}
		});
		txtDOB_D.setText("DD");
		txtDOB_D.setBounds(395, 254, 66, 22);
		contentPanel.add(txtDOB_D);
		txtDOB_D.setColumns(10);
		
		txtDOB_Y = new JTextField();
		txtDOB_Y.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtDOB_Y.getText().equals("YYYY"))
					txtDOB_Y.setText("");
			}
		});
		txtDOB_Y.setText("YYYY");
		txtDOB_Y.setBounds(485, 254, 66, 22);
		contentPanel.add(txtDOB_Y);
		txtDOB_Y.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String firstName = txtFirstName.getText();
						String lastName = txtLastName.getText();
						String userName = txtUserName.getText();
						String password = txtPassword.getText();
						String DOB = txtDOB_Y.getText()+"-"+txtDOB_M.getText()+"-"+txtDOB_D.getText();
						long ssn = Long.parseLong(txtSSN.getText());
						try {
							Statement stmt = con.createStatement();
							stmt.executeUpdate("INSERT INTO `velociraptorsattack`.`user` (`USERNAME`, `PASSWORD`, `U_FIRSTNAME`, `U_LASTNAME`, `USERTYPE`, `SUSPENDED`, `U_SSN`) VALUES ('"+userName+"', '"+password+"', '"+firstName+"', '"+lastName+"', 'Patient', '0', '"+ssn+"')");
							stmt.executeUpdate("INSERT INTO `velociraptorsattack`.`patients` (`P_FIRSTNAME`, `P_LASTNAME`, `DOB`, `P_SSN`) VALUES ('"+firstName+"', '"+lastName+"', '"+DOB+"', '"+ssn+"')");
							Object[] options = {"Ok"};
							int n = JOptionPane.showOptionDialog(null, "Patient Created!","Created!", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options, null);
							if(n == JOptionPane.YES_OPTION){
								mac.setDoctorPatientTableModel();
								dispose();
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							JOptionPane.showMessageDialog(null, "Patient Creation Error","Error!", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
