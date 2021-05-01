package objectPackage;

public class Main {
	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager();
		
		//create new users
		User user1 = new User(1,"Özgürhan","Polat","ozgurhan.45@gmail.com",
				"+0342442433","Turkey");
		User user2 = new User(2,"Fatih","Dönmez","fatih245@gmail.com",
				"+035642433","Germany");
		User user3 = new User(3,"Mahmut","Gediz","gediz.@gmail.com",
				"+0342442433","Spanish");
		User user4 = new User(4,"Mehmet","Vural","vural.mehmet@gmail.com",
				"+0342442433","Turkey");
		
		// create new courses
		Course course1 = new Course(1,2,"JAVA+REACT","Engin Demirog",
				"2 Ay Surecek Yazılım Geliştirici Kampı",
				"Java Image",0);
		Course course2 =  new Course(2,1,"C#+Angular","Engin Demirog",
				"2 ay surecek Yazılım Geliştirici Kampı",
				"C# Image",0);
		Course course3 =  new Course(3,3,"Python-Java-C#","Engin Demirog",
				"Python-Java-C# Temelleri",
				"Prgramming Image",0);
	
		User[] users = {
				user1,
				user2,
				user3,
				user4
		};
			
		Course[] courses =  {
				course1,
				course2,
				course3
		};
		
		courseManager.showCourses(courses);
		
	}
}
