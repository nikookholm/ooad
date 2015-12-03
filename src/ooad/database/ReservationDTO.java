package ooad.database;

import java.io.Serializable;
import java.util.Date;


public class ReservationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	int reservationID;
	int customerID; 	  
	int productID;  
	int spotID;
	boolean dog = false;
	int amountAdult;
	int amountChild;
	Date startDate;
	Date endDate;
	int status = 0;
	int power = 0;
	boolean paid = false;

	public ReservationDTO()
	{
		
	}
	
	public ReservationDTO(int customerID, int spotID, Date startDate, Date endDate, int amountAdult, 
						  int amountChild, String status, boolean dog)
	{
	
		this.customerID 	= customerID;
		this.spotID 		= spotID;
		this.amountAdult	= amountAdult;
		this.amountChild	= amountChild;
		this.startDate		= startDate;
		this.endDate		= endDate;
		this.dog			= dog;
	}
	
	public int 		getCustomerID() { return customerID; }
	public int 		getSpotID() { return spotID; }
	public int 		getProductID() { return productID; }
	public boolean 	getDog() { return dog; }
	public int 		getAmountAdult() { return amountAdult; }
	public int 		getAmountChild() { return amountChild; }
	public int 		getStatus() { return status; }
	public Date		getStartDate (){return startDate;}
	public Date		getEndDate () {return endDate;}
	
	public void 	setStatus(int status) {this.status = status;}
	public void 	setStartDate(Date startDate) {this.startDate = startDate; }
	public void 	setEndDate (Date endDate) {this.endDate = endDate; }
	
}

