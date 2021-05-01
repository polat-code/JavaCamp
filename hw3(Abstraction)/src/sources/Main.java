package sources;

public class Main {
	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"Özgürhan","Polat",21,"+624242322","Java/React");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setName("Kadir");
		instructor2.setAge(21);
		instructor2.setContact("+64353458922");
		instructor2.setGivenCourses("C#");
		
		
		Student student1 = new Student(1, "Ali", "Sönmez", 17, "+956625222", "Java/React");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Kadir");
		student2.setSurname("Bilge");
		student2.setAge(25);
		student2.setContact( "+9532135222");
		student2.setTakenCourses("C#");
		
		
		UserManager userManager = new UserManager();
		
		userManager.logIn(student1);
		userManager.logIn(student2);
		userManager.logOut(student1);
	
		StudentManager studentManager = new StudentManager();
		
		studentManager.changeYourName("Mehmet", student2);
		studentManager.deleteCourse(student2);
		
		InstructorManager ınstInstructorManager = new InstructorManager();
		
		ınstInstructorManager.addACourse(".NET", instructor2);
		ınstInstructorManager.addACourse("Python", instructor1);
		
	}
}
