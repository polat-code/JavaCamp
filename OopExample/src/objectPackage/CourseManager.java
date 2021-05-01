package objectPackage;

public class CourseManager {
	public void showCourses(Course[] courses) {
		for(int i = 0; i < courses.length;i++) {
			System.out.println("Course: " + courses[i].name + " Trainer :" + courses[i].trainer + " Price :" + courses[i].price);
		}
	}
	
	public Course[] addNewCourse(Course[] courses,Course newCourse) {
		// Create new Array to extend courses array
		Course[] newCourseArray = new Course[courses.length + 1];
		
		// Copy the items from courses to newCourseArray
		for(int i = 0; i < courses.length ; i++) {
			newCourseArray[i] = courses[i];
		}
		
		// Add newCourse to array and return it
		newCourseArray[courses.length] = newCourse; 
		return newCourseArray;
	}
	
}
