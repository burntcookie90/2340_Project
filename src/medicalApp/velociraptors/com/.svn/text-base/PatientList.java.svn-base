package medicalApp.velociraptors.com;

import java.util.ArrayList;

/**
 * 
 * @author Xiang Feng
 *
 */
public class PatientList {
	ArrayList<Patient> patientList;
	public PatientList(Patient patient){
		patientList = new ArrayList<Patient>();
		addPatient(patient);
	}
	
	/**
	 * 
	 * @param P
	 */
	public void addPatient(Patient P)
	{
		for(int i = 0;i<patientList.size();i++){
			if(patientList.get(i).equals(P)){
				return;
			}
			else{
				patientList.add(P);
			}
		}
	}
	
	/**
	 * 
	 * @param P
	 * @return
	 */
	public ArrayList<Patient> remove(Patient P){
			patientList.remove(P);
		return patientList;
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	public Patient find(String p){
		for(int i = 0;i<patientList.size();i++){
			if(patientList.get(i).getName().equals(p)){
				return patientList.get(i);
			}
		}
		return null;
	}
}