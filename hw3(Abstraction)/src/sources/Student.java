package sources;

public class Student extends User {
	private String takenCourses;
	
	Student() {
		
	}
	
	Student(int id, String name, String surname, int age , String contact,String takenCourses) {
		super(id,name,surname,age,contact);
		this.takenCourses = takenCourses;
		
	}

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}
	
	

}
