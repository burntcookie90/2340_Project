package medicalApp.velociraptors.com;

/**
 * Class that handles the logging on of a User. Allows for 3 login attempts, if all fail then locks the user out.
 * @author Vishnu
 *
 */
public class Login {
	private int checkCounter;
	private UserList userList;
	
	public Login(){
		checkCounter = 0;
	}
	
	public boolean checkUserName(String input){
		if(checkCounter <4){
			for(int i = 0;i<userList.size();i++){
				if(input.equals(userList.find(i).getUserName())){
					checkCounter = 0;
					return true;

				}
			}
		}
		checkCounter++;
		return false;
	}
	
	public boolean checkPassword(String input){
		for(int i = 0;i<userList.size();i++){
			if(input.equals(userList.find(i).getPassword()))
				return true;
		}
		return false;
	}
	
	public int getCheckCounter(){
		return checkCounter;
	}
	
	public void setCheckCounter(int checkCounter){
		this.checkCounter = checkCounter;
	}

	public UserList getUserList() {
		return userList;
	}

	public void setUserList(UserList userList) {
		this.userList = userList;
	}
}
