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
	

	public ReservationDTO()
	{
		
	}
	
	public ReservationDTO(int reservationID, int customerID, int spotID, int productID, boolean dog, int amountAdult, int amountChild, String startDate, String endDate)
	{
		this.reservationID 	= reservationID;
		this.customerID 	= customerID;
		this.spotID 		= spotID;
		this.dog			= dog;
		this.amountAdult	= amountAdult;
		this.amountChild	= amountChild;
		this.startDate		= startDate;
		this.endDate		= endDate;
	}
	
	public int 		getKundeID() { return customerID; }
	public int 		getProduktID() { return productID; }
	public int 		getPladsID() { return spotID; }
	public boolean 	getHund() { return dog; }
	public int 		getAntalVoksne() { return amountAdult; }
	public int 		getAntalBarn() { return amountChild; }
	public int 		getStatus() { return status; }
	public String	getstartDate (){return startDate;}
	public String	getSlutDato () {return endDate;}
	
	public void 	setstartDate(String startDate) {this.startDate = startDate; }
	public void 	setSlutDato (String slutDato) {this.endDate = slutDato; }
	
}

