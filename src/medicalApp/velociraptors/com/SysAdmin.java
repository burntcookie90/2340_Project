package medicalApp.velociraptors.com;

/**
 * @author Lsun
 *
 */
public class SysAdmin extends Doctor{
	
	public SysAdmin () {}
	
	public SysAdmin(PatientList p) {
		super();
	}
	
	public PatientList getPatientList() {
		return super.getPatientList();
	}

	public void setPatientList(PatientList p) {
		super.setPatientList(p);
	}

	protected Patient findPatient(PatientList p, String name) {
		return super.findPatient(p, name);
	}

	protected void newRecord(Patient p, String in, Appointment a) {
		super.newRecord(p, in, a);
	}

	protected void addPatient(Patient p) {
		super.addPatient(p);
	}

	protected void viewPatient(Patient p) {
		super.viewPatient(p);
	}

	protected Patient deletePatient(Patient p) {
		return super.deletePatient(p);
	}

	protected Patient editPatient(Patient p, String in) {
		return super.editPatient(p, in);
	}

	protected void viewDaily() {
		super.viewDaily();
	}


	protected void addOrder(Patient p, String in){
		super.addOrder(p, in);
	}
	
	protected void viewHist(Patient p){
		super.viewHist(p);
	}
	
	public void suspend(Account a) {
		a.setAccountAccess(false);
	}
	
	public void unSuspend(Account a) {
		a.setAccountAccess(true);
	}
	
	public void setPassword(User u, String pass) {
		u.setPassword(pass);
	}
	
	public void addUser(UserList ulist, String name, String pass, String accountType) {
		User u = null;
		if (accountType.equalsIgnoreCase("nurse")) u = new Nurse();
		else if (accountType.equalsIgnoreCase("doctor")) u = new Doctor();
		else if (accountType.equalsIgnoreCase("patient")) u = new Patient();
		else if (accountType.equalsIgnoreCase("sysadmin")) u = new SysAdmin();
		else System.err.println("Invalid account type.");
		ulist.addUser(u);
	}
	
	public void editUser(UserList ulist, User u, User new_user) {
		this.deleteUser(ulist, u);
		ulist.addUser(new_user);
	}
	
	public void deleteUser(UserList ulist, User u) {
		for(int i = 0;i<ulist.size();i++){
			if(u.getUserName().equals(ulist.find(i).getUserName()))
				ulist.removeUser(u);
		}
	}
}
