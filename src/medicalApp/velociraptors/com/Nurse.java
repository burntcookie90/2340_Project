
package medicalApp.velociraptors.com;

/**
 * The Nurse class houses all the methods that the Nurse is able to implement. The Nurse directly implements the
 * User interface and all the methods.
 * @author Vishnu
 *
 */
public class Nurse extends User {
	
	PatientList patientList;
	
	public Nurse(){
		
	}
	
	/**
	 * Constructor for the Nurse class that has a patientList.
	 * @param p inputted patientList to set to Nurse
	 */
	public Nurse(PatientList p){
		patientList = p;
	}
	
	/**
	 * Returns the Nurse's PatientList
	 * @return Patientlist of the nurse
	 */
	public PatientList getPatientList(){
		return patientList;
	}
	
	/**
	 * Set's the nurse's patient list
	 * @param p patientList to store in the Nurse class
	 */
	public void setPatientList(PatientList p){
		patientList = p;
	}
	
	/**
	 * Finds a patient in a Nurse's patient list
	 * @param p PatientList to search
	 * @param name name of patient
	 * @return patient
	 */
	protected Patient findPatient(PatientList p, String name){
		return p.find(name);
	}
	
	/**
	 * Creates a new Patient Record
	 * @param p Patient to create record for
	 * @param in String for description
	 * @param a Appointment
	 */
	protected void newRecord(Patient p, String in, Appointment a){
		
	}
	
	/**
	 * Adds a patient to the Nurse's Patient List
	 * @param p Patient to add to the PAtientList
	 */
	protected void addPatient(Patient p){
		patientList.addPatient(p);
	}
	
	/**
	 * Views a patient in a Nurse's PatientList
	 * @param p Patient to view
	 */
	protected void viewPatient(Patient p){
		
	}
	
	/**
	 * Deletes a patient from the Nurse's patientList and returns the deleted Patient
	 * @param p Patient to delete
	 * @return Patient tht was deleted
	 */
	protected Patient deletePatient(Patient p){
		return null;
	}
	
	/**
	 * Edits a patient
	 * @param p Patient to edit
	 * @param in data to edit
	 * @return editted patient
	 */
	protected Patient editPatient(Patient p, String in){
		return null;
	}
	
	/**
	 * Generates a daily report for the Nurse
	 */
	protected void viewDaily(){
		
	}
}
