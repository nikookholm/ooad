package ooad.database;

public class SpotDTO {
	
	int spotID;
	int productID;
	int location;
	
	public SpotDTO()
	{
		
	}
	public SpotDTO(int spaceID, int productID, int location){
		
		this.spotID = spaceID;
		this.productID = productID;
		this.location = location;
	}
	public int getSpaceID(){return spotID;}
	public int getProductID(){return spotID;}
	public int getLocation(){return location;}
}



