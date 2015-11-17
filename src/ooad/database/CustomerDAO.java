package ooad.database;

public interface CustomerDAO {

	void saveCustomer(CustomerDTO customer) throws DALException;
	CustomerDTO getCustomer(int customerID) throws DALException;
}
