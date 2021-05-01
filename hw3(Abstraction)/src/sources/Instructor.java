package sources;

public class Instructor extends User{
	private String givenCourses;
	
	Instructor() {
		
	}
	
	
	Instructor(int id, String name, String surname, int age , String contact,String givenCourses) {
		//super();
		super(id,name,surname,age,contact);
		this.givenCourses = givenCourses;
	}
	
	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
	
}	
