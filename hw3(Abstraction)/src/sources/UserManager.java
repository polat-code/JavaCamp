package sources;

public class UserManager {
	public void logIn(User user) {
		System.out.println(getFullName(user) + "is logged in!");
	}
	
	public void logOut(User user) {
		System.out.println(getFullName(user) + " is logged out!" );
	}
	
	public String getFullName(User user) {
		return (user.getName() + " " + user.getSurname());
	}
	
}
