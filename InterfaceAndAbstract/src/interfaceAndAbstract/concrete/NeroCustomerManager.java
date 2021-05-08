package interfaceAndAbstract.concrete;

import interfaceAndAbstract.abstracts.BaseCustomerManager;
import interfaceAndAbstract.abstracts.CustomerCheckService;
import interfaceAndAbstract.entities.Customer;


public class NeroCustomerManager  extends BaseCustomerManager{
	private CustomerCheckService  customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		// TODO Auto-generated method stub
		this.save(customer);		
	}											
	 

}
