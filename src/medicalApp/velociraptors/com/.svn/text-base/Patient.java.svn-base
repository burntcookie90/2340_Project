package medicalApp.velociraptors.com;

/**
 * The Patient class acts as an extension of the User class in order to serve as a digital representation of the functionality
 * and capabilities of a patient within the MedApp system.
 *
 * I worked on this assignment alone, using only course materials.
 *
 * @author Danny Cook
 * @version 0.2 3/8/2011
 */ 
public class Patient extends User {

	/**
	 * The patient's medical history.
	 */ 
	private MedicalHistory medHist;
	
	/**
	 * The patient's name.
	 */ 
	private String name;
	
	/**
	 * The patient's date of birth.
	 */ 
	private String dateOfBirth;
	
	/**
	 * The appointment currently belonging to the patient.
	 */ 
	private Appointment appt;
	
	/**
	 * The standard constructor for Patient will use a medHist file, name, and dateOfBirth that will be supplied by a User
	 * with Nurse-level security or higher.
	 *
	 * @param medHist The patient's previous medical history file
	 * @param name The patient's name
	 * @param dateOfBirth The patient's date of birth.
	 */ 
	public Patient(MedicalHistory medHist, String name, String dateOfBirth) {
		this.medHist = medHist;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	} //end Patient constructor
	
	/**
	 * The optional constructor for Patient will create a medHist file for the patient, since the patient is new to the practice. 
	 * Name and dateOfBirth that will be supplied by a User
	 * with Nurse-level security or higher.
	 *
	 * @param name The patient's name
	 * @param dateOfBirth The patient's date of birth.
	 */ 
	public Patient(String name, String dateOfBirth) {
		this.medHist = new MedicalHistory(); //creates a new Medical History, which will also, in turn, create a new, empty histArray.
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	} //end optional Patient constructor
	
	/**
	 * In the event that the patient is an emergency case, and has no identification (suitable for implementation in a Grade One Trauma facility),
	 * This constructor will label the patient's name with the current time of day, and the patient's dateOfBirth as the current date.
	 * This is more efficient than labeling the patient merely as a "John Doe" or a "Jane Doe".
	 *
	 */ 
	public Patient() {
		this.medHist = new MedicalHistory();
		//this.name =
		//this.dateOfBirth = 
	} //end emergency Patient constructor

	/**
	 * Uses the patient's given Medical History to add a Treatment Record for the patient.
	 * 
	 * @param a The appointment for which a Treatment Record will be added.
	 */ 
	public void addTreatmentRecord(Appointment a) {
		medHist.addRecord(a);
	} //end addTreatmentRecord class
	
	/**
	 * The viewMedHist method returns a string value for the patient's medical history, for viewing within a GUI.
	 * 
	 * @return A String representation of medHist.
	 */ 
	public String viewMedHist() {
		//uses this class's medHist to return a printable version of the patient's current medHist.
		return medHist.toString();
	} //end viewMedHist class
	
	/**
	 * The requestAppt method allows a patient to request a new appointment, which will be added to their records and later passed on to other
	 * relevant Users for manipulation.
	 * 
	 * @param a The appointment the patient has requested.
	 */ 
	public void requestAppt(Appointment a) {
		appt = a; //reflects the most recent appointment on record for the patient.
		medHist.addRecord(a);
	} //end requestAppt class
	
	/**
	 * The getMedHist method returns a patient's medical history.
	 * 
	 * @return medHist
	 */ 
	public MedicalHistory getMedHist() {
		return medHist;
	} //end getMedHist method.

	/**
	 * Sets the patient's medHist to the object specified.
	 *
	 * @param medHist The MedicalHistory object specified for insertion.
	 */ 
	public void setMedHist(MedicalHistory medHist) {
		this.medHist = medHist;
	} //end setMedHist class

	/**
	 * The getName method returns a patient's name.
	 * 
	 * @return name
	 */ 
	public String getName() {
		return name;
	} //end getName method

	/**
	 * Set's the patient's name to the object specified.
	 *
	 * @param name The String object specified for insertion.
	 */ 
	public void setName(String name) {
		this.name = name;
	} //end setName method

	/**
	 * The getDateOfBirth method returns a patient's date of birth.
	 * 
	 * @return dateOfBirth
	 */ 
	public String getDateOfBirth() {
		return dateOfBirth;
	} //end getDateOfBirth method

	/**
	 * Set's the patient's date of birth to the object specified.
	 *
	 * @param dateOfBirth The String object specified for insertion.
	 */ 
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	} //end setDareOfBirth method
	
	/**
	 * The getAppt method returns a patient's most recent appointment on record.
	 * 
	 * @return appt
	 */ 
	public Appointment getAppt() {
		return appt;
	} //end getAppt method

	/**
	 * Set's the patient's most recent appointment to the object specified.
	 * NOTE: This does not automatically add it to the patient's treatment records. This must be called manually.
	 *
	 * @param appt The Appointment object specified for insertion.
	 */ 
	public void setAppt(Appointment appt) {
		this.appt = appt;
	} //end setAppt method.
	
	/**
	 * The toString method simply returns the name of the patient, for use in various
	 * code testing and cataloguing.
	 *
	 * @return name
	 */ 
	public String toString() {
		return name;
	}
	
} //end class Patient
