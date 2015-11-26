package ooad.server;

import ooad.database.ExtraOptionDTO;
import ooad.database.ExtraProductDTO;
import ooad.database.ProductDTO;
import ooad.database.ReservationDTO;

public class Billing {
	
	static boolean isCheckedIn;
	static double amount;
		
	static void checkIn(){
		isCheckedIn = true;
	}
	
	static double checkOut(ReservationDTO res){
		amount = 0;
		
		//extra tilvalg - hvad har købt
		//eaxtra produkt - hvad du har købt af
		
		int id = res.getCustomerID();
		ExtraOptionDTO xopts;
		ExtraProductDTO xprod;
		ProductDTO prods;
		
		
		amount = amount + res.getAmountAdult() + res.getAmountChild();
		if(res.getDog()) amount = amount + dog;
		
		receipt(res);
		return amount;
	}
	
	static void receipt(ReservationDTO res){
		
	}
}
