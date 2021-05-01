package oopIntro;

public class Product {
	// Buraya kesinlikle iş yapan methodlar yazma çünkü class lar ve methodlar 
	//sadece bir iş yaparlar . Bu class data tutuyor o yüzden işlem için başka 
	// class kur.
	
	private int id;			//final da sadece constructor da bir şey  atayabilirsin.
	private String name;
	private double unitPrice;		// her zaman private kullan çok faydasını göreceksin.
	private String detail;			// buna soyutlama da denir.
	private double discount;
	
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
	

	
	
}
