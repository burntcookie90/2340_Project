package medicalApp.velociraptors.com;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LookupPatient extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtDOB;
	private JTextField txtSSN;
	private JCheckBox chckbxSocialSecurityName;
	private JCheckBox chckbxDob;
	private JCheckBox chckbxLastName;
	private JCheckBox chkFirstName;
	protected boolean firstName;
	protected boolean lastName;
	protected boolean boolDOB;
	protected boolean boolSSN;
	private MedAppController mac;
	protected String fName;
	protected String lName;
	protected String dateOfBirth;
	protected int socialSN;

	/**
	 * Create the dialog.
	 */
	public LookupPatient(final MedAppController mac) {
		this.mac = mac;
		setResizable(false);
		setBounds(100, 100, 521, 263);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		chkFirstName = new JCheckBox("First Name");
		chkFirstName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JCheckBox target = (JCheckBox)arg0.getSource();
				firstName = target.isSelected();				
				txtFirstName.setEnabled(target.isSelected());
				
			}
		});
		chkFirstName.setBounds(73, 61, 97, 23);
		contentPanel.add(chkFirstName);
		
		chckbxLastName = new JCheckBox("Last Name");
		chckbxLastName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JCheckBox target = (JCheckBox)arg0.getSource();
				lastName = target.isSelected();
				txtLastName.setEnabled(target.isSelected());
			
			}
		});
		chckbxLastName.setBounds(73, 87, 97, 23);
		contentPanel.add(chckbxLastName);
		
		chckbxDob = new JCheckBox("DOB");
		chckbxDob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JCheckBox target = (JCheckBox)arg0.getSource();
				boolDOB = target.isSelected();
				txtDOB.setEnabled(target.isSelected());
			
			}
		});
		chckbxDob.setBounds(73, 113, 97, 23);
		contentPanel.add(chckbxDob);
		
		chckbxSocialSecurityName = new JCheckBox("Social Security Name");
		chckbxSocialSecurityName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JCheckBox target = (JCheckBox)arg0.getSource();
				boolSSN= target.isSelected();
				txtSSN.setEnabled(target.isSelected());
			
			}
		});
		chckbxSocialSecurityName.setBounds(73, 139, 171, 23);
		contentPanel.add(chckbxSocialSecurityName);
		
		txtFirstName = new JTextField();
		txtFirstName.setEnabled(false);
		txtFirstName.setBounds(250, 61, 219, 22);
		contentPanel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setEnabled(false);
		txtLastName.setBounds(250, 87, 219, 22);
		contentPanel.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtDOB = new JTextField();
		txtDOB.setEnabled(false);
		txtDOB.setBounds(250, 113, 219, 22);
		contentPanel.add(txtDOB);
		txtDOB.setColumns(10);
		
		txtSSN = new JTextField();
		txtSSN.setEnabled(false);
		txtSSN.setBounds(250, 139, 219, 22);
		contentPanel.add(txtSSN);
		txtSSN.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnSearch = new JButton("Search");
				btnSearch.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						fName = txtFirstName.getText();
						System.err.println("fName: "+fName);
						
						lName = txtLastName.getText();
						System.err.println("lName: "+lName);
						
						dateOfBirth = txtDOB.getText();
						System.err.println("DOB: "+dateOfBirth);
						
						if(txtSSN.isEnabled())
							socialSN = Integer.parseInt(txtSSN.getText());
						else
							socialSN =0;
						
						System.err.println("SSN: "+socialSN);
						search();
					}
				});
				btnSearch.setActionCommand("OK");
				buttonPane.add(btnSearch);
				getRootPane().setDefaultButton(btnSearch);
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
	
	private void search(){
		PatientLookupResults plr = new PatientLookupResults(mac);
		plr.setFirstName(fName);
		plr.setLastName(lName);
		plr.setDateOfBirth(dateOfBirth);
		plr.setSocialSN(socialSN);
		plr.setVisible(true);
	}
}
