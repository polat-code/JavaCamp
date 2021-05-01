package sources;

public class StudentManager {
	
	public void registerCourse(User user) {
		System.out.println("You registered to this course!");
	}
	
	public void changeYourName(String newName,User user) {
		System.out.println(user.getName() +  " is changed to " + newName);
	}
	
	public void deleteCourse(User user) {
		System.out.println("This course is deleted successfully!");
	}
	

}
