package objectPackage;

public class User {
	//This class is for keeping data about user.
	
	int id ;
	String name;
	String surname;
	String email;
	String contact;
	String address;
	
	User(int id ,String name ,String surname,String email,
			String contact,String address) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.contact = contact;
		this.email = email;
		this.address = address;
		
		
	}
}
