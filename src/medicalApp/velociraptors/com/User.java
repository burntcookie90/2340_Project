
package medicalApp.velociraptors.com;

/**
 * @author Lsun
 *
 */
public class User {
  private String userName, password;
  
  public User() { 
    this(null, null);
  }
  
  public User(String userName, String password) { 
    this.userName = userName;
    this.password = password;
  }
  
  public boolean login(String userName, String password) {
    Account a = new Account();
    int counter = 0;
    Login log = new Login();
    while (log.getCheckCounter() < 4) {
      if (log.checkUserName(userName) && log.checkPassword(password)) {
        a.setAccountAccess(true);
        return a.getAccountAccess();
      }
      counter ++;
      log.setCheckCounter(counter);
    }
    return a.getAccountAccess();
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String userName) {
    this.userName = userName;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public void logout(Account a) {
    a.setAccountAccess(false);
  }
}
