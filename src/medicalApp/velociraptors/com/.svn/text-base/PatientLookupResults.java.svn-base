package medicalApp.velociraptors.com;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class PatientLookupResults extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int socialSN;
	
	private MedAppController mac;
	private JTable table;

	/**
	 * Create the dialog.
	 */
	public PatientLookupResults(final MedAppController mac) {
		this.mac = mac;
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 770, 491);
			contentPanel.add(scrollPane);
			table = new JTable(myModel(firstName,lastName,dateOfBirth,socialSN));
		}
		
		JButton btnDeletePatient = new JButton("Delete Selected Patient");
		btnDeletePatient.setBounds(20, 513, 180, 30);
		contentPanel.add(btnDeletePatient);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(600, 513, 180, 30);
		contentPanel.add(btnCancel);
	}
	
	public LookupTableModel myModel(String firstName2, String lastName2, String dateOfBirth2, int socialSN2){
		LookupTableModel model = new LookupTableModel(mac,firstName2,lastName2,dateOfBirth2,socialSN2);
		return model;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the socialSN
	 */
	public int getSocialSN() {
		return socialSN;
	}

	/**
	 * @param socialSN the socialSN to set
	 */
	public void setSocialSN(int socialSN) {
		this.socialSN = socialSN;
	}
}
