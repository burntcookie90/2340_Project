//File comment
package medicalApp.velociraptors.com;

/**
* The TreatmentRecord class is designed to manipulate and hold the information
* dedicated to a patient's treatment records.
* 
* @author Danny Cook
* @version 1.0 4/8/2011§
*/ 
public class TreatmentRecord {

	/**
	 * Represents the name of the doctor
	 */ 
	private String doctorName;
	
	/**
	 * The appointment object corresponding to the record.
	 */ 
	private Appointment appointment;
	
	/**
	 * Represents the doctor orders corresponding to the record.
	 */
	private String doctorOrders;
	
	/**
	 * The basic constructor for TreatmentRecord takes in no parameters, and sets all fields to null.
	 */ 
	public TreatmentRecord() {
		doctorName = null;
		appointment = null;
		doctorOrders = null;
	} //end default TreatmentRecord constructor
	
	/**
	 * The secondary TreatmentRecord constructor takes in three parameters, and sets their fields accordingly.
	 *
	 * @param doctorName The name of the doctor corresponding to the record.
	 * @param appointment The appointment object corresponding to the record.
	 * @param doctorOrders The doctor orders corresponding to the record.
	 */ 
	public TreatmentRecord(String doctorName, Appointment appointment, String doctorOrders) {
		this.doctorName = doctorName;
		this.appointment = appointment;
		this.doctorOrders = doctorOrders;
	} //end secondary TreatmentRecord constructor

	/**
	 * The getDoctorName method simply returns the doctor's name.
	 *
	 * @return doctorName
	 */ 
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * The setDoctorName method sets the name of the doctor as determined by the parameter.
	 *
	 * @param doctorName The String object representing the name of the doctor.
	 */ 
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * The getAppointment method returns the appointment object corresponding to the file.
	 *
	 * @return appointment
	 */
	public Appointment getAppointment() {
		return appointment;
	}

	/**
	 * The setAppointment method sets the appointment object as determined by the parameter.
	 *
	 * @param appointment The appointment object to be set in the file.
	 */ 
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	/**
	 * The getDoctorOrders method returns the doctor orders corresponding to the file.
	 *
	 * @return doctorOrders
	 */
	public String getDoctorOrders() {
		return doctorOrders;
	}

	/**
	 * The setDoctorOrders method sets the doctor orders as determined by the parameter
	 *
	 * @param doctorOrders The String object representing the doctor orders for this TreatmentRecord.
	 */ 
	public void setDoctorOrders(String doctorOrders) {
		this.doctorOrders = doctorOrders;
	}
	
	/**
	 * The toString method simply returns the string representing the file.
	 *
	 * @return doctorName
	 */ 
	public String toString(){
		return doctorName;
	}
	
}
