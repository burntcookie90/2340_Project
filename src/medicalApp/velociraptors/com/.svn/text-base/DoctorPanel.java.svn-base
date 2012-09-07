package medicalApp.velociraptors.com;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
/**
 * GUI panel for the Doctor User
 * @author Vishnu
 *
 */
@SuppressWarnings("serial")
public class DoctorPanel extends JPanel {

	private JTextPane lblDoctorInfo;
	public JTable tblDoctorPatientList;
	private MedAppController mac;
	private JScrollPane scrollPane;
	protected Integer chosenSSN;
	private JButton btnLogout;
	private JLabel lblNewLabel;
	private JSeparator separator_2;
	private JLabel lblPatientActions;
	private JButton btnLookup;
	private JButton btnDelete;
	private JButton btnAdd;
	private JSeparator separator_1;
	private JSeparator separator;

	/**
	 * Create the panel with parameter Controller
	 */
	public DoctorPanel(final MedAppController mac) {
		this.mac = mac;
		setLayout(null);
		
		separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(0, 100, 150, 2);
		add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(150, 0, 2, 600);
		add(separator_1);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddPatientDialog adp = new AddPatientDialog(mac);
				adp.setVisible(true);
			}
		});
		btnAdd.setBounds(33, 182, 89, 23);
		add(btnAdd);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = JOptionPane.showConfirmDialog(null, "Do you want to delete this patient?");
				if(n == JOptionPane.YES_OPTION){
					
					try {
						String sql = "DELETE FROM `patients` WHERE P_SSN = '"+chosenSSN+"'";
						System.err.println(sql);
						String sql2 = "DELETE FROM `user` WHERE U_SSN = '"+chosenSSN+"'";
						System.err.println(sql);
						Connection con = mac.getCon();
						Statement stmt = con.createStatement();
						int rs = stmt.executeUpdate(sql);
						int rs2 = stmt.executeUpdate(sql2);
						JOptionPane.showMessageDialog(null, "Patient Deleted!");
						mac.setDoctorPatientTableModel();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		btnDelete.setBounds(33, 235, 89, 23);
		add(btnDelete);
		
		btnLookup = new JButton("Lookup");
		btnLookup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LookupPatient lp = new LookupPatient(mac);
				lp.setVisible(true);
			}
		});
		btnLookup.setBounds(33, 289, 89, 23);
		add(btnLookup);
		
		lblPatientActions = new JLabel("Patient Actions");
		lblPatientActions.setBounds(10, 157, 136, 14);
		add(lblPatientActions);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(Color.GRAY);
		separator_2.setBounds(0, 400, 150, 2);
		add(separator_2);
		
		lblNewLabel = new JLabel(new ImageIcon("135Hospital-Administration-Velociraptors-Attack.jpg"));
		lblNewLabel.setBounds(10, 413, 130, 130);
		add(lblNewLabel);
		
		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mac.setCurrentUser("", "");
				mac.setCurrentCard("Login");
				mac.setLoginSuccess(false);
			}
		});
		btnLogout.setBounds(33, 554, 89, 23);
		add(btnLogout);
		
		lblDoctorInfo = new JTextPane();
		lblDoctorInfo.setBackground(UIManager.getColor("Button.background"));
		lblDoctorInfo.setEditable(false);
		lblDoctorInfo.setBounds(10, 11, 130, 78);
		add(lblDoctorInfo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(162, 22, 628, 567);
		add(scrollPane);

	}

	public void setInfo(String firstName, String lastName, String currentUser) {
		lblDoctorInfo.setText(firstName+" "+lastName+"\n"+currentUser);		
	}
	
	public void tableInit(){
		try {
			tblDoctorPatientList = new JTable(myModel());

			tblDoctorPatientList.setFillsViewportHeight(true);
			scrollPane.setViewportView(tblDoctorPatientList);
			
			tblDoctorPatientList.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (arg0.getClickCount() == 2) {
						JTable target = (JTable)arg0.getSource();
						int row = target.getSelectedRow();
						chosenSSN = (Integer) target.getValueAt(row, 3);
						DoctorPatientView dpv = new DoctorPatientView(chosenSSN);
						dpv.setVisible(true);
					}
					if (arg0.getClickCount() == 1) {
						JTable target = (JTable)arg0.getSource();
						int row = target.getSelectedRow();
						chosenSSN = (Integer) target.getValueAt(row, 3);
					}
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
	public TableModel myModel() throws Exception{
		TableModel model = new TableModel(mac);
			return model;
	}
}
