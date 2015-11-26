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
	
	public ReservationDTO(int reservationID, int customerID, int spotID, boolean dog, int amountAdult, 
						  int amountChild, String startDate, String endDate, int status, int power, boolean paid)
	{
		this.reservationID 	= reservationID;
		this.customerID 	= customerID;
		this.spotID 		= spotID;
		this.dog			= dog;
		this.amountAdult	= amountAdult;
		this.amountChild	= amountChild;
		this.startDate		= startDate;
		this.endDate		= endDate;
		this.power			= power;
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
	public boolean 	getPaid() {return paid;}
	public String	getStartDate (){return startDate;}
	public String	getEndDate () {return endDate;}
	
	public void 	setStartDate(String startDate) {this.startDate = startDate; }
	public void 	setEndDate (String endDate) {this.endDate = endDate; }
	
}

