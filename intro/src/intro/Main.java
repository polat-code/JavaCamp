package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// camelCase
		// Don't repeat yourself
		String bankDepartmentButton = "İnternet Şubesi";
		System.out.println(bankDepartmentButton);
		
		double lastDollar = 8.20;
		double currentDollar = 8.20;
		int vade = 36;
		boolean  isDrop = false; 
		
		if(lastDollar > currentDollar) {
			System.out.println("Dollar Düştü resmi");
		}else if(lastDollar < currentDollar) {
			System.out.println("Dolar Yükseldi resmi");
		}
		else {
			System.out.println("Dolar eşittir resmi");
		}
		
		String kredi1 = "Hızlı Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5  = "Msb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler  = {
				"Hızlı Kredi",
				"Mutlu emekli kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb kredisi"};
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		int num1 = 40;
		int num2 = 34;
		int num3 = 23;
		int biggestNum ;
		
		if((num1 > num2) && (num1 > num3)) {
			biggestNum = num1;
		}else if((num2 > num1) && (num2 > num3)) {
			biggestNum = num2;
		}else {
			biggestNum = num3;
		}
		
			
		System.out.println("The biggest one is " + biggestNum);
	}
	
	

}
