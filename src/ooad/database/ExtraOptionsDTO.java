package ooad.database;

public class ExtraOptionsDTO {
	int id;
	int reservationsID;
	double consumption;
	int ekstraProductID;
	boolean isPayed = false;
	
	public ExtraOptionsDTO(int id, int reservationsID, double consumption, int ekstraProductID, 
																			boolean isPayed){	
		this.id = id;
		this.reservationsID = reservationsID;
		this. consumption = consumption;
		this.ekstraProductID = ekstraProductID;
		this.isPayed = isPayed;
	}
}