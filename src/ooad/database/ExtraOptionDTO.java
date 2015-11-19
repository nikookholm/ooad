package ooad.database;

public class ExtraOptionDTO {
	int id;
	int reservationsID;
	double consumption;
	int ekstraProductID;
	boolean isPayed = false;
	
	public ExtraOptionDTO(int id, int reservationsID, double consumption, int ekstraProductID, 
																			boolean isPayed){	
		this.id = id;
		this.reservationsID = reservationsID;
		this. consumption = consumption;
		this.ekstraProductID = ekstraProductID;
		this.isPayed = isPayed;
	}
}