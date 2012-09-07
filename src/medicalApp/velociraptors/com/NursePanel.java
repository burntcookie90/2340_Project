package medicalApp.velociraptors.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class NursePanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public NursePanel(MedAppController mac) {
		
		setLayout(null);
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(150, 0, 1, 600);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 100, 750, 2);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 400, 150, 2);
		add(separator_2);
		
		JButton btnAddPatient = new JButton("Add Patient");
		btnAddPatient.setBounds(10, 159, 110, 23);
		add(btnAddPatient);
		
		JButton btnDeletePatient = new JButton("Delete Patient");
		btnDeletePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDeletePatient.setBounds(10, 193, 110, 23);
		add(btnDeletePatient);
		
		JButton btnNewButton = new JButton("Look Up Patient");
		btnNewButton.setBounds(10, 227, 110, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nurse Information");
		lblNewLabel.setBounds(10, 75, 130, 14);
		add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("View Daily");
		btnNewButton_1.setBounds(10, 441, 110, 23);
		add(btnNewButton_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(161, 100, 110, 500);
		add(textPane);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(279, 0, 2, 600);
		add(separator_3);
		
		JLabel lblPatientList = new JLabel("Patient List");
		lblPatientList.setBounds(161, 75, 110, 14);
		add(lblPatientList);
		
		JLabel lblPatientInformation = new JLabel("Patient Information");
		lblPatientInformation.setBounds(291, 75, 130, 14);
		add(lblPatientInformation);
		
		textField = new JTextField();
		textField.setBounds(10, 128, 110, 20);
		add(textField);
		textField.setColumns(10);


	}
}
