package medicalApp.velociraptors.com;

import java.util.ArrayList;
import java.util.List;

/**
* The MedicalHistory class serves as a representation of a patient's full medical history. Archival methods will be added later for storing
* relevant data to servers; for now, each recurring object will serve as a record for each new patient.
* 
* I worked on this assignment alone, using only course materials.
* 
* @author Danny Cook
* @version 0.1 3/9/2011
*/ 
public class MedicalHistory {

	/**
	 * The full list of TreatmentRecord objects pertaining to this patient.
	 */ 
	private List<TreatmentRecord> histArray;
	
	/**
	 * The standard MedicalHistory constructor takes in a histArray and sets it in place
	 * of the pre-existing variable for the class.
	 *
	 * @param histArray The array of TreatmentRecord objects to be set.
	 */ 
	public MedicalHistory(List<TreatmentRecord> histArray) {
		this.histArray = histArray;
	}
	
	/**
	 * The secondary MedicalHistory constructor takes on no parameters, creating an
	 * empty ArrayList for the histArray variable.
	 */ 
	public MedicalHistory() {
		histArray = new ArrayList<TreatmentRecord>();
	}
	
	/**
	 * The addOrders method allows a new set of Doctor Orders to be added to a particular treatment record within the array.
	 * If the record is not found, an error message is returned, to allow the user to correct the mistake.
	 *
	 * @param t The TreatmentRecord that is being specified for modification.
	 * @param s The string of DoctorOrders that are going to be added to the record.
	 * @return A message regarding the success or failure of the operation.
	 */ 
	public String addOrders(TreatmentRecord t, String s) {
		
		if (histArray.isEmpty() || t == null || t.getAppointment() == null) {
			return "Addition Failed! Please check the parameters and try again.";
		}
		
		final int arraySize = histArray.size();
		
		for (int i = 0; i < arraySize; i++) {
			if (histArray.get(i).getAppointment().getApptDate().compareTo(t.getAppointment().getApptDate()) == 0) {
				histArray.get(i).setDoctorOrders(s);
				return "Addition Successful!";
			} //end if statement
		} //end for loop
		
		return "Addition Failed! The specified record does not exist.";
	} //end addOrders method
	
	/**
	 * The addRecord method adds a new Treatment Record to the end of the array, using the specified information.
	 *
	 * @param a The Appointment object that will be added to the Treatment Record, containing most of the pertinent information.
	 */
	public void addRecord(Appointment a) {
		final TreatmentRecord temp = new TreatmentRecord();
		temp.setAppointment(a);
		histArray.add(temp);
	} //end addRecord method
	
	/**
	 * This method overrides the generic toString method for Objects, breaking the patient's treatment record down into manageable blocks
	 * for manipulation by a GUI.
	 *
	 * @return The String format of the patient's full Treatment Records
	 */ 
	public String toString() {
		final int arraySize = histArray.size();
		String s = "";
		
		for (int i = 0; i < arraySize; i++) {
			s = s + histArray.get(i).toString() + "/n"; //make sure to code the proper toString format for Treatment Record, including info from Appointments!
		} //end for loop
		
		return s;
	} //end toString method
	
	/**
	 * Sets histArray to the object specified.
	 *
	 * @param histArray The array of Treatment Records that will replace the current patient's records.
	 */ 
	public void setHistArray(List<TreatmentRecord> histArray) {
		this.histArray = histArray;
	} //end setHistArray method
	
	/**
	 * Returns the patient's Treatment Records.
	 *
	 * @return The array of Treatment Records belonging to the patient.
	 */ 
	public List<TreatmentRecord> getHistArray() {
		return histArray;
	} //end getHistArray method
	
	
}
