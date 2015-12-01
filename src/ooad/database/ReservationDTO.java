package ooad.database;

import java.io.Serializable;

public class ReservationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	int reservationID;
	int customerID; 	  
	int productID;  
	int spotID;
	boolean dog = false;
	int amountAdult;
	int amountChild;
	String startDate;
	String endDate;
	int status = 0;
	int power = 0;
	boolean paid = false;

	public ReservationDTO()
	{
		
	}
	
	public ReservationDTO(int reservationID, int customerID, int spotID, String startDate, String endDate, int amountAdult, 
						  int amountChild, boolean dog, int status, int power)
	{
		this.reservationID 	= reservationID;
		this.customerID 	= customerID;
		this.spotID 		= spotID;
		this.amountAdult	= amountAdult;
		this.amountChild	= amountChild;
		this.startDate		= startDate;
		this.endDate		= endDate;
		this.dog			= dog;
	}
	
	public int		getReservationID () { return reservationID; }
	public int 		getCustomerID() { return customerID; }
	public int 		getSpotID() { return spotID; }
	public int 		getProductID() { return productID; }
	public boolean 	getDog() { return dog; }
	public int 		getAmountAdult() { return amountAdult; }
	public int 		getAmountChild() { return amountChild; }
	public int 		getStatus() { return status; }
	public int 		getPower() { return power;}
	public String	getStartDate (){return startDate;}
	public String	getEndDate () {return endDate;}
	
	public void 	setStatus(int status) {this.status = status;}
	public void 	setStartDate(String startDate) {this.startDate = startDate; }
	public void 	setEndDate (String endDate) {this.endDate = endDate; }
	
}

