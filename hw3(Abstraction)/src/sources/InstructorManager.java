package sources;

public class InstructorManager {
	public void addACourse(String newCourseName, Instructor instructor) {
		instructor.setGivenCourses(instructor.getGivenCourses() + "," + newCourseName);
		System.out.println(newCourseName +" is added succesfully!");
	}
}
