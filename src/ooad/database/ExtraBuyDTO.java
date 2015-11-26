package ooad.database;

public class ExtraBuyDTO {
	int id;
	int reservationID;
	double consumption;
	int extraProductID;
	boolean isPayed = false;
	
	public ExtraBuyDTO(int id, int reservationID, double consumption, int extraProductID, 
																			boolean isPayed){	
		this.id = id;
		this.reservationID = reservationID;
		this. consumption = consumption;
		this.extraProductID = extraProductID;
		this.isPayed = isPayed;
		
	}
	
	public int getId(){return id;}
	public int getReservationsID(){return reservationID;}
	public double getConsumption(){return consumption;}
	public int getEkstraProductID(){return extraProductID;}
	public boolean getExtraProductID(){return false ;}
}