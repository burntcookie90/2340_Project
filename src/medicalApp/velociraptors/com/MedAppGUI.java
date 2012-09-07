package medicalApp.velociraptors.com;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * JFrame enclosing the entire application
 * @author Vishnu
 *
 */
@SuppressWarnings("serial")
public class MedAppGUI extends JFrame{
	private MedAppController mac;
	private static JFrame frame;

	/**
	 * Instantiates a new Controller class and passes itself into that class
	 * Initializes the GUI
	 */
	public MedAppGUI() {
		mac= new MedAppController(this);
		frame = new JFrame();
		initialize();
	}
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		MedAppGUI mag= new MedAppGUI();
		
		frame.setPreferredSize(new Dimension(1024,768));
		frame.setResizable(false);
		
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * lol
	 * Initialize the frame
	 */
	private void initialize() {
		frame.setTitle("welcome");
		frame.setResizable(false);
		frame.setBounds(100,100,1024,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		mac.setLocation(112,131);
		mac.setSize(800,600);
		frame.getContentPane().add(mac);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to The Medical Application Thingy");
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setFont(new Font("Calibri", Font.PLAIN, 39));
		lblWelcomeToThe.setBounds(10, 11, 998, 109);
		frame.getContentPane().add(lblWelcomeToThe);
		
	}
	
}