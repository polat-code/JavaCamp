package oopIntro;

public class Course {
	int id;
	String name;
	String trainer;
	String detail;
	String image;
	int price;
	
	Course(int id, String name, String trainer, String detail,
			String image, int price) {
		this.id = id;
		this.name = name;
		this.trainer = trainer;
		this.detail = detail;
		this.image = image;
		this.price = price;
	}
}
