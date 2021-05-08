package interfaceAndAbstract;

import interfaceAndAbstract.abstracts.BaseCustomerManager;
import interfaceAndAbstract.concrete.CustomerCheckManager;
import interfaceAndAbstract.concrete.NeroCustomerManager;
import interfaceAndAbstract.concrete.StarbucksCutomerManager;
import interfaceAndAbstract.entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseCustomerManager customerManager = new StarbucksCutomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1,"Özgürhan","Polat",2000,"34434232121"));
		
		
	}

}
