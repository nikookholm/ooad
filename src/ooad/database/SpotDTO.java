package ooad.database;

public class SpotDTO {
	
	int spaceID;
	int productID;
	int location;
	int reservationID;
	public SpotDTO(int spaceID, int productID, int location, int reservationID){
		
		this.spaceID = spaceID;
		this.productID = productID;
		this.location = location;
		this.reservationID = reservationID;
	}
	public int getSpaceID(){return spaceID;}
	public int getProductID(){return spaceID;}
	public int getLocation(){return location;}
	public int reservationID(){return reservationID;}
}



