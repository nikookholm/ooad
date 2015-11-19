package ooad.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {
	
	static void saveCustomer(CustomerDTO customer) throws DALException{
		
		Connector.doQuery("INSERT INTO customer( ) ");
	}
	
	static CustomerDTO getCustomer(int customerID) throws DALException{

		ResultSet res = Connector.doQuery("SELECT * FROM customer WHERE customerID = " + customerID);
		try {
	    	if (!res.first()) throw new DALException("Kunden " + customerID + " findes ikke");
	    	return new CustomerDTO(res.getInt("customerID"), res.getString("name"), res.getString("email"));
	    }
	    catch (SQLException e) {throw new DALException(e); }

	}
}
