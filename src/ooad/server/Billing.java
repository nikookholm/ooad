package ooad.server;

import java.util.ArrayList;

import ooad.database.ExtraBuyDTO;
import ooad.database.ExtraOptionDAO;
import ooad.database.ExtraOptionDTO;
import ooad.database.ExtraProductDAO;
import ooad.database.ExtraProductDTO;
import ooad.database.ProductDAO;
import ooad.database.ProductDTO;
import ooad.database.ReservationDTO;

public class Billing {
	
	static boolean isCheckedIn;
	static double amount;
	
//	ExtraBuyDAO xOptDAO;
	ExtraBuyDTO xBuyDTO;
	ExtraProductDTO xProdDTO;
	ProductDAO prodDAO;
	ProductDTO prodDTO;
	
	static void checkIn(){
		isCheckedIn = true;
	}
	
	static double checkOut(ReservationDTO res){
		amount = 0;
		
		int id = res.getCustomerID();

		ArrayList<ExtraBuyDTO> XBuyDTOls = new ArrayList<ExtraBuyDTO>();
//		XBuyDTOls = xBuyDAO.get(id);
		
		for (ExtraBuyDTO i : XBuyDTOls) {
			ExtraBuyDTO xBuyDTO;
			ExtraProductDTO xProdDTO;
			int xID = xBuyDTO.getEkstraProductID();
			double xCon = xBuyDTO.getConsumption();
			
			amount = amount + xBuyDTO.getPrice();
		}
		
		amount = amount + res.getAmountAdult() + res.getAmountChild();
//		if(res.getDog()) amount = amount + dog;
		
		receipt(res);
		return amount;
	}
	
	static void receipt(ReservationDTO res){
		
	}
}


