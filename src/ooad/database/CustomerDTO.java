package ooad.database;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	
	private int 	customerID;
	private String 	name;
	private String 	email;
	
	public CustomerDTO( int customerID, String name, String email){
		
		this.customerID = customerID;
		this.name = name;
		this.email = email;
	}
	
	public int getCustomerID(){	return customerID; }
	public String getName(){ return name; }
	public String getEmail(){ return email; }
}
