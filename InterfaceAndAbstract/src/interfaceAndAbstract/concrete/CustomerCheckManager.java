package interfaceAndAbstract.concrete;

import interfaceAndAbstract.abstracts.CustomerCheckService;

import interfaceAndAbstract.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	

}
