package interfaceAndAbstract.abstracts;

import interfaceAndAbstract.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to db " + customer.getFirstName());
	}
	
	
}
