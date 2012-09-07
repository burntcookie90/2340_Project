package medicalApp.velociraptors.com;

import junit.framework.TestCase;

public class PatientListTest extends TestCase {

	public void setUp() throws Exception {
		super.setUp();
	}
	public void testFine1()
	{
		String xiang = "xiang";
		PatientList test = new PatientList(null);
		assertEquals(xiang, test.find(xiang));
	}
	public void testFind2() {
		Patient next = new Patient();
		String xiang = "xiang";
		next.setName(xiang);
		PatientList test = new PatientList(next);
		assertEquals(next, test.find(xiang));
	}
	public void testFind3()
	{
		PatientList test = new PatientList(null);
		Patient peter = new Patient();
		test.addPatient(peter);
		String name1 = "peter";
		peter.setName(name1);
		assertEquals(peter, test.find(name1));
	}	public void testFind4()
	{
		PatientList test = new PatientList(null);
		Patient peter = new Patient();
		test.addPatient(peter);
		String name1 = "peter";
		Patient james = new Patient();
		test.addPatient(james);
		String name2 = "james";
		peter.setName(name1);
		james.setName(name2);
		assertEquals(peter, test.find(name1));
		assertEquals(james, test.find(name2));
	}
}

