package sources;

public class User {
	private int id;
	private String name;
	private String surname;
	private int age;
	private String contact;
	private String address;
	
	User() {
		
	}
	User(int id, String name, String surname, int age , String contact) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age ;
		this.contact = contact;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	

}
