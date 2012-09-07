package medicalApp.velociraptors.com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SysAdminPanel extends JPanel {
	private JTable table;
	private JTextPane lblSysAdminInfo;
	//private MedAppController mac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SysAdminPanel dialog = new SysAdminPanel(new MedAppController(new MedAppGUI()));
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setInfo(String firstName, String lastName, String currentUser) {
		lblSysAdminInfo.setText(firstName+" "+lastName+"\n"+currentUser);
		
	}
	
	/**
	 * Create the panel.
	 */
	public SysAdminPanel(final MedAppController mac) {
		setBackground(SystemColor.menu);
		setPreferredSize(new Dimension(800,600));
		setLayout(null);
		
		JLabel lblSysAdminInfo = new JLabel("System Administrator");
		lblSysAdminInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSysAdminInfo.setBounds(0, 0, 146, 95);
		add(lblSysAdminInfo);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(0, 100, 150, 2);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(150, 0, 2, 600);
		add(separator_1);
		
		JButton button = new JButton("Add");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AddPatientDialog adp = new AddPatientDialog(mac);
				adp.setVisible(true);
			}
		});
		button.setBounds(33, 182, 89, 23);
		add(button);
		
		JButton button_1 = new JButton("Delete");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//DeletePatientDialog dpd = new DeletePatientDialog(mac);
				//dpd.setVisible(true);
			}
		});
		button_1.setBounds(33, 235, 89, 23);
		add(button_1);
		
		JButton button_2 = new JButton("Lookup");
		button_2.setBounds(33, 289, 89, 23);
		add(button_2);
		
		JLabel label_1 = new JLabel("Patient Actions");
		label_1.setBounds(10, 157, 79, 14);
		add(label_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.GRAY);
		separator_2.setBounds(0, 400, 150, 2);
		add(separator_2);
		
		JList list = new JList();
		list.setVisibleRowCount(50);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(162, 583, 628, -572);
		add(list);
		
		JLabel label_2 = new JLabel((Icon) null);
		label_2.setBounds(10, 413, 130, 130);
		add(label_2);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(756, 422, -542, -374);
		add(table);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("Hospital-Administration-Velociraptors-Attack.jpg"));
		lblNewLabel.setBounds(673, 22, -1, -1);
		this.add(lblNewLabel);
	}
}
