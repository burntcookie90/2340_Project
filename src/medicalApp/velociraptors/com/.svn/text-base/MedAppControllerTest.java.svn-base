package medicalApp.velociraptors.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedAppControllerTest {	
	@Test
	public void testMedAppController() {
	}

	@Test
	public void testGetLoginSuccess() {
		//First test: base case
		medAppGUI frame = new medAppGUI();
		MedAppController mac = new MedAppController(frame);
		assertEquals(false,mac.getLoginSuccess());
		
		//Second: Fail case
		assertEquals(true,!mac.getLoginSuccess());
	}

	@Test
	public void testSetLoginSuccess() {
		medAppGUI frame = new medAppGUI();
		MedAppController mac = new MedAppController(frame);
		
		//First test: base case
		assertEquals(false,mac.getLoginSuccess());
		
		//Second test: method test
		mac.setLoginSuccess(true);
		assertEquals(true,mac.getLoginSuccess());
	}

	@Test
	public void testGetCurrentCard() {
		medAppGUI frame = new medAppGUI();
		MedAppController mac = new MedAppController(frame);
		
		
	}

	@Test
	public void testSetCurrentCard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCurrentUser() {
		fail("Not yet implemented");
	}

}
