package objectPackage;

public class Course {
	//This class is for keeping data about course.
	
	int id;
	int categoryId ;
	String name;
	String trainer;
	String detail;
	String image;
	int price;
	
	Course(int id,int categoryId, String name, String trainer, String detail,
			String image, int price) {
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.trainer = trainer;
		this.detail = detail;
		this.image = image;
		this.price = price;
	}
}
