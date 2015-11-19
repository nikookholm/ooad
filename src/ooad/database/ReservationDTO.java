package ooad.database;

import java.io.Serializable;

public class ReservationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	int reservationID;
	int kundeID; 	  
	int produktID;  
	int pladsID;
	boolean hund = false;
	int antalVoksne;
	int antalBarn;
	String startDato;
	String slutDato;
	int status = 0;
	

	public ReservationDTO()
	{
		
	}
	
	public ReservationDTO(int reservationID, int kundeID, int pladsID, int produktID, boolean hund, int antalVoksne, int antalBarn, String startDato, String slutDato)
	{
		this.reservationID 	= reservationID;
		this.kundeID 		= kundeID;
		this.pladsID 		= pladsID;
		this.hund			= hund;
		this.antalVoksne	= antalVoksne;
		this.antalBarn		= antalBarn;
		this.startDato		= startDato;
		this.slutDato		= slutDato;
	}
	
	public int 		getKundeID() { return kundeID; }
	public int 		getProduktID() { return produktID; }
	public int 		getPladsID() { return pladsID; }
	public boolean 	getHund() { return hund; }
	public int 		getAntalVoksne() { return antalVoksne; }
	public int 		getAntalBarn() { return antalBarn; }
	public int 		getStatus() { return status; }
	public String	getStartDato (){return startDato;}
	public String	getSlutDato () {return slutDato;}
	
	public void 	setStartDato(String startDato) {this.startDato = startDato; }
	public void 	setSlutDato (String slutDato) {this.slutDato = slutDato; }
	
}

