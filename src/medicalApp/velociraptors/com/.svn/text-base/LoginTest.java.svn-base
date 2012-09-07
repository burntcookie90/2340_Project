package medicalApp.velociraptors.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {

	@Test
	public void testCheckUserName() {
		UserList uL = new UserList();
		
		//Create new doctor, with "doctor" as username
		Doctor doctor = new Doctor();
		doctor.setUserName("doctor");
		uL.addUser(doctor);
		
		//Create new nurse with "nurse" as username
		Nurse nurse = new Nurse();
		nurse.setUserName("nurse");
		uL.addUser(nurse);
		
		//Create new patient with "patient" as username
		Patient patient = new Patient();
		patient.setUserName("patient");
		uL.addUser(patient);
		
		Login login = new Login();
		login.setUserList(uL);
		
		//True tests
		assertEquals(true,login.checkUserName("doctor"));
		assertEquals(true,login.checkUserName("nurse"));
		assertEquals(true,login.checkUserName("patient"));
		
		//False Tests
		assertEquals(false,login.checkUserName("SysAdmin"));
		
		//Test for null
		assertEquals(false,login.checkUserName(""));
		
		//Test for multiple attempts failing
		login.setCheckCounter(0);
		assertEquals(false,login.checkUserName("SysAdmin"));
		assertEquals(false,login.checkUserName("SysAdmin"));
		assertEquals(false,login.checkUserName("SysAdmin"));
		assertEquals(false,login.checkUserName("SysAdmin"));
		assertEquals(4,login.getCheckCounter());
		assertEquals(false,login.checkUserName("patient"));
		
		//Test for multiple attempts passing
		login.setCheckCounter(0);
		login.checkUserName("patient");
		login.checkUserName("patient");
		login.checkUserName("patient");
		login.checkUserName("patient");
		login.checkUserName("patient");
		
		assertEquals(0,login.getCheckCounter());
		
	}

}
