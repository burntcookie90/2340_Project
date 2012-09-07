package medicalApp.velociraptors.com;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class DoctorPatientView extends JDialog {

	private JSlider slider;

	/**
	 * Create the dialog.
	 */
	public DoctorPatientView(int currentSSN) {
		setBounds(100, 100, 640, 480);
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 604, 380);
		getContentPane().add(textArea);
		
		JButton btnAddDoctorsOrder = new JButton("Add Doctor's Order");
		btnAddDoctorsOrder.setBounds(346, 408, 125, 23);
		getContentPane().add(btnAddDoctorsOrder);
		
		JButton btnViewReport = new JButton("View Report");
		btnViewReport.setBounds(495, 408, 119, 23);
		getContentPane().add(btnViewReport);
		
		slider = new JSlider();
		slider.setValue(100);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMaximum(200);
		slider.setMajorTickSpacing(25);
		slider.setBounds(74, 402, 262, 35);
		getContentPane().add(slider);
		
		JLabel lblTextSize = new JLabel("Text Size:");
		lblTextSize.setBounds(20, 412, 62, 14);
		getContentPane().add(lblTextSize);
	}
}
