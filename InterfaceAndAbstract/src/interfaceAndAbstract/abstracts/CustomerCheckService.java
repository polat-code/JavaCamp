package interfaceAndAbstract.abstracts;

import interfaceAndAbstract.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
