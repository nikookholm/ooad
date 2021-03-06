package ooad.database;

import java.io.Serializable;
import java.util.Date;


public class ReservationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	int reservationID;
	int customerID; 	  
	int productID;  
	int spotID;
	int hasDog = 0;
	int amountAdult;
	int amountChild;
	Date startDate;
	Date endDate;
	String status;

	public ReservationDTO()
	{
		
	}
	
	public ReservationDTO(int customerID, int spotID, Date startDate, Date endDate, int amountAdult, 
						  int amountChild, String status)
	{
	
		this.customerID 	= customerID;
		this.spotID 		= spotID;
		this.amountAdult	= amountAdult;
		this.amountChild	= amountChild;
		this.startDate		= startDate;
		this.endDate		= endDate;
		this.status			= status;
	}
	
	public int		getReservationID(){return reservationID;}
	public int 		getCustomerID() { return customerID; }
	public int 		getSpotID() { return spotID; }
	public int 		getProductID() { return productID; }
	public int 		getAmountAdult() { return amountAdult; }
	public int 		getAmountChild() { return amountChild; }
	public String 	getStatus() { return status; }
	public Date		getStartDate (){return startDate;}
	public Date		getEndDate () {return endDate;}
	
	public void 	setStatus(String status) {this.status = status;}
	public void 	setStartDate(Date startDate) {this.startDate = startDate; }
	public void 	setEndDate (Date endDate) {this.endDate = endDate; }
	
}

