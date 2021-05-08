package interfaceAndAbstract.concrete;

import interfaceAndAbstract.abstracts.BaseCustomerManager;
import interfaceAndAbstract.abstracts.CustomerCheckService;
import interfaceAndAbstract.entities.Customer;

public class StarbucksCutomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;

	public StarbucksCutomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	} 
	

	
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
	
	
}
