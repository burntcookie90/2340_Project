package medicalApp.velociraptors.com;
/**
 * 
 * @author Xiang Feng
 *
 */
public class Appointment {
	public String apptDate, desiredDoctor;
	public int apptTime;
	/**
	 * 
	 * @param apptDate
	 * @param desiredDoctor
	 * @param apptTime
	 */
	public Appointment(String apptDate,String desiredDoctor, int apptTime){
		this.apptDate = apptDate;
		this.desiredDoctor = desiredDoctor;
		this.apptTime = apptTime;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getApptDate() {
		return apptDate;
	}
	
	/**
	 * 
	 * @param apptDate
	 */
	public void setApptDate(String apptDate) {
		this.apptDate = apptDate;
	}
   
	/**
	 * 
	 * @return
	 */
	public String getDesiredDoctor() {
		return desiredDoctor;
	}
	
	/**
	 * 
	 * @param desiredDoctor
	 */
	public void setDesiredDoctor(String desiredDoctor) {
		this.desiredDoctor = desiredDoctor;
	}

	/**
	 * 
	 * @return
	 */
	public int getApptTime() {
		return apptTime;
	}

	public void setApptTime(int apptTime) {
		this.apptTime = apptTime;
	}
}
