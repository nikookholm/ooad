package ooad.server;

import java.util.ArrayList;

import ooad.database.ExtraBuyDTO;
import ooad.database.ExtraProductDTO;
import ooad.database.ProductDAO;
import ooad.database.ProductDTO;
import ooad.database.ReservationDTO;

public class Billing {
	
	static boolean isCheckedIn;
	static double amount;
	
	ExtraProductDTO xProdDTO;
	ExtraBuyDTO xBuyDTO;
	ProductDTO prodDTO;
	ProductDAO prodDAO;
	
	static void checkIn(){
		isCheckedIn = true;
	}
	
	static double checkOut(ReservationDTO res){
		//Reservation
		//ProductDTO
		//ExtraProductDTO
		//ExtraBuy
		
		amount = 0;
		
		if(res.getDog()) amount = amount + dog;
		
		ProductDTO prodDTO;
		
		int id = res.getCustomerID();
		ArrayList<ExtraBuyDTO> XBuyDTOls = new ArrayList<ExtraBuyDTO>();
		
		for (ExtraBuyDTO i : XBuyDTOls) {
			ExtraBuyDTO xBuyDTO;
			ExtraProductDTO xProdDTO;
			int xID = xBuyDTO.getEkstraProductID();
			double xCon = xBuyDTO.getConsumption();
			
			amount = amount + xBuyDTO.getPrice();
		}
		
		
		receipt(res);
		return amount;
	}
	
	static void receipt(ReservationDTO res){
		
	}
}


