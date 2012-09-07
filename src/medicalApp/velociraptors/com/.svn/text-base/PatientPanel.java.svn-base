package medicalApp.velociraptors.com;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
* The PatientPanel class serves as a graphical representation of the Patient class 
* and its functionality.
*
*/ 
@SuppressWarnings("serial")
public class PatientPanel extends JPanel {

	private MedAppController mac;

	private JScrollPane scrollPane;

	//@SuppressWarnings("unused")
	//private JTextPane lblDoctorInfo;

	public JTable tblDoctorPatientList;

	//@SuppressWarnings("unused")
	//private String firstName;

	//@SuppressWarnings("unused")
	//private String lastName;

	//@SuppressWarnings("unused")
	//private String currentUser;

	private final JTextPane lblPatientInfo;

	private final JLabel lblNewLabel;
	
	private final int sixH = 600;
	
	private final int six = 6;
	
	private final int oneFifty = 150;

	/**
	 * Create the panel.
	 * 
	 * @param mac The MedAppController object that governs the panel's operation.
	 */
	public PatientPanel(final MedAppController mac) {
		setLayout(null);

		final JSeparator separator = new JSeparator();
		separator.setBounds(oneFifty, six, 12, sixH);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		add(separator);

		final JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(six, 100, oneFifty, 12);
		add(separator_1);

		final JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(six, 400, oneFifty, 12);
		add(separator_2);

		final JButton btnViewMedHist = new JButton("View Med. Hist.");
		btnViewMedHist.addActionListener(new ActionListener() {
			public final void actionPerformed(ActionEvent arg0) {

			} // End actionPerformed method for btnViewMedHist
		}); // End ActionListener addition
		btnViewMedHist.setBounds(six, 170, 132, 29);
		add(btnViewMedHist);

		final JButton btnNewAppointment = new JButton("New Appointment");
		btnNewAppointment.addActionListener(new ActionListener() {
			public final void actionPerformed(ActionEvent arg0) {

			} // End actionPerformed method for btnNewAppointment
		}); // End ActionListener addition
		btnNewAppointment.setBounds(six, 211, 132, 29);
		add(btnNewAppointment);

		final JLabel lblSelectAnAction = new JLabel("Select an Action:");
		lblSelectAnAction.setBounds(16, 124, 111, 16);
		add(lblSelectAnAction);

		final JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public final void actionPerformed(ActionEvent arg0) {
				final int dialog = JOptionPane.showConfirmDialog(new JFrame(),
						"Are you sure you would like to log out?",
						"Logout Confirmation", JOptionPane.YES_NO_OPTION);
				if (dialog == JOptionPane.YES_OPTION) {
					mac.setCurrentUser("", "");
					mac.setCurrentCard("Login");
					mac.setLoginSuccess(false);
				} // end if statement
			} // end actionPerformed method
		});
		btnLogOut.setBounds(six, 252, 132, 29);
		add(btnLogOut);

		lblNewLabel = new JLabel(new ImageIcon(
				"135Hospital-Administration-Velociraptors-Attack.jpg"));
		lblNewLabel.setBounds(10, 413, 130, 130);
		add(lblNewLabel);

		lblPatientInfo = new JTextPane();
		lblPatientInfo.setBackground(UIManager.getColor("Button.background"));
		lblPatientInfo.setBounds(six, six, 137, 86);
		add(lblPatientInfo);

	} // End PatientPanel constructor

	/**
	 * The tableInit method initializes the table for use in the database.
	 *
	 */ 
	public final void tableInit() {
		try {
			tblDoctorPatientList = new JTable(myModel());

			tblDoctorPatientList.setFillsViewportHeight(true);
			scrollPane.setViewportView(tblDoctorPatientList);

			tblDoctorPatientList.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (arg0.getClickCount() == 2) {
						final JTable target = (JTable) arg0.getSource();
						final int row = target.getSelectedRow();
						@SuppressWarnings("unused")
						final int ssn = (Integer) target.getValueAt(row, 3);
					} // end if statement
				} // end mouseClicked method
			}); // End MouseListener addition
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end catch block
	} // end tableInit method

	/**
	 * The myModel method initializes the table model that helps drive database access
	 * for the class.
	 *
	 *	@return The model.
	 */ 
	public final TableModel myModel() {
		final TableModel model = new TableModel(mac);
		return model;
	} // end myModel method

	/**
	 * The setInfo method takes in the information for the patient and sets its text
	 * for display on the panel.
	 * 
	 * @param firstName The patient's first name.
	 * @param lastName The patient's last name.
	 * @param currentUser The current user's information.
	 */ 
	public final void setInfo(String firstName, String lastName, String currentUser) {
		lblPatientInfo.setText(firstName + " " + lastName + "\n" + currentUser);

	}
} // end class PatientPanel

