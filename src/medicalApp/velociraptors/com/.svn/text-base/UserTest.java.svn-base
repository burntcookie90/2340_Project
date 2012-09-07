/**
 * 
 */
package medicalApp.velociraptors.com;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * UserTest.java
 * Tests the User class method login
 * 
 * @author Lsun
 */
public class UserTest extends TestCase {

 /**
  * @throws java.lang.Exception
  */
 @Before
 public void setUp() throws Exception {
  super.setUp();
 }

 /**
  * Test method for {@link medicalApp.velociraptors.com.User#login(medicalApp.velociraptors.com.Account, java.lang.String, java.lang.String)}.
  */
 @Test
 public final void testLogin() {
  /* Test case 1 one try pass */
  User u = new User();
  u.setUserName("lsun31");
  u.setPassword("1234");
  Account a = new Account();
  boolean b = u.login(u.getUserName(), u.getPassword());
  a.setAccountAccess(true);
  assertEquals(a.getAccountAccess(),b);
  
  /* Test case 2 one try fail */
  a = (Account) new Object();
  b = u.login(u.getUserName(), "4321");
  a.setAccountAccess(false);
  assertEquals(a.getAccountAccess(),b);
  
  /* Test Case 3 third pass */
  a = (Account) new Object();
  b = u.login(u.getUserName(), "4321");
  b = u.login(u.getUserName(), "432");
  b = u.login(u.getUserName(), "1234");
  a.setAccountAccess(true);
  assertEquals(a.getAccountAccess(),b);
  
  /* Test Case 4 third fail */
  a = (Account) new Object();
  b = u.login(u.getUserName(), "4321");
  b = u.login(u.getUserName(), "432");
  b = u.login(u.getUserName(), "43");
  a.setAccountAccess(false);
 assertEquals(a.getAccountAccess(),b);
  
  /* Test Case 5 fourth pass */
  a = (Account) new Object();
  b = u.login(u.getUserName(), "4321");
  b = u.login(u.getUserName(), "432");
  b = u.login(u.getUserName(), "43");
  b = u.login(u.getUserName(), "1234");
  a.setAccountAccess(false);
 assertEquals(a.getAccountAccess(),b);
  
  /* Test Case 6 fourth fail */
  a = (Account) new Object();
  b = u.login(u.getUserName(), "4321");
  b = u.login(u.getUserName(), "432");
  b = u.login(u.getUserName(), "43");
  b = u.login(u.getUserName(), "4");
  a.setAccountAccess(false);
 assertEquals(a.getAccountAccess(),b);
 }
}
