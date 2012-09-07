package medicalApp.velociraptors.com;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JPanel;

/**
 * Controls the entire program. Allows each panel to talk to each other and controls the updating of the dynamic panel
 * @author Vishnu
 *
 */
@SuppressWarnings("serial")
public class MedAppController extends JPanel {
	private LoginGUI login;
	private CardLayout cl = new CardLayout();
	@SuppressWarnings("unused")
	private MedAppGUI frame;
	private boolean loginSuccessful;
	private String currentCard;
	private String currentUser;
	private LoginSuccessful loginSuccess;
	@SuppressWarnings("unused")
	private String accountType;
	private DoctorPanel dP;
	private PatientPanel patientPanel;
	private NursePanel nursePanel;
	private SysAdminPanel saPanel;
	private Connection con;
	
	/**
	 * Constructor for the MedAppController class
	 * @param frame	The JFrame MedAppGUI to control
	 */
	public MedAppController(MedAppGUI frame){
		con=null;
		this.frame = frame;
		login = new LoginGUI(this);
		loginSuccess = new LoginSuccessful(this);
		dP = new DoctorPanel(this);
		patientPanel = new PatientPanel(this);
		nursePanel = new NursePanel(this);
		saPanel = new SysAdminPanel(this);
		
		loginSuccessful = false;
		currentCard = "Login";
		currentUser = "";
		
		this.setLayout(cl);
		this.add("Login", this.login);
		this.add("LoginSuccess", this.loginSuccess);
		this.add("DoctorPanel", this.dP);
		this.add("PatientPanel",this.patientPanel);
		this.add("NursePanel",this.nursePanel);
		this.add("SysAdminPanel", this.saPanel);
	}
	
	/**
	 * Returns whether the login was a success or not
	 * @return boolean true if login was successful false if not
	 */
	public boolean getLoginSuccess(){
		return loginSuccessful;
	}
	
	/**
	 * After logging in, set the loginSuccess boolean value to true and false after logging out
	 * @param b true if logged in, false if logged out
	 */
	public void setLoginSuccess(boolean b){
		loginSuccessful = b;
	}
	
	/**
	 * Returns the current card of the dynamic panel
	 * @return String name of the card
	 */
	public String getCurrentCard(){
		return currentCard;
	}
	
	/**
	 * Sets the current card of the dynamic panel
	 * @param in String name of the card to change to
	 */
	public void setCurrentCard(String in){
		currentCard = in;
		cl.show(this, currentCard);
	}
	
	/**
	 * Returns the current logged in user
	 * @return username of the current user
	 */
	public String getCurrentUser(){
		return currentUser;
	}
	
	/**
	 * Sets the current user and their account type, clears fields if logging out
	 * @param in username of current user
	 * @param accountType accountType of current user
	 */
	public void setCurrentUser(String in, String accountType){
		currentUser = in;
		this.accountType=accountType;
		
		if(in.equals("")&&accountType.equals("")){
			login.clearFields();
		}
	}

	/**
	 * Makes the connection to the database and passes the Connection to all Panels of the program
	 * @return Connection to the database
	 */
	public Connection makeConnection(){
		con = null; 
		try { 
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			con = DriverManager.getConnection("jdbc:mysql://vrdesktop.dyndns.org/velociraptorsattack", "attack", "velociraptors"); 
			if(!con.isClosed()) 
				System.out.println("Successfully connected to " + 
				"MySQL server using TCP/IP..."); 
		} catch(Exception e) { 
			System.err.println("Exception: " + e.getMessage()); 
		}
		return con;
	}
	
	public void setDoctorInfo(String firstName, String lastName){
		dP.setInfo(firstName, lastName, currentUser);
	}

	public Connection getCon() {
		return con;
	}

	public void setDoctorPatientTableModel() {
		try {
			dP.tableInit();
			dP.tblDoctorPatientList.setModel(dP.myModel());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void setPatientInfo(String firstName, String lastName) {
		patientPanel.setInfo(firstName,lastName,currentUser);
		
	}
	
	public void setSysAdminInfo(String firstName, String lastName){
		saPanel.setInfo(firstName, lastName, currentUser);
	}

}
