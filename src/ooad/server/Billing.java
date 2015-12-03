package ooad.server;

import java.util.ArrayList;

import ooad.database.DALException;
import ooad.database.ExtraBuyDTO;
import ooad.database.ExtraProductDTO;
import ooad.database.ProductDAO;
import ooad.database.ProductDTO;
import ooad.database.ReservationDTO;

public class Billing {
	
	private static final int id = 0;
	static boolean isCheckedIn;
	static double amount;
	
//	ExtraProductDTO xProdDTO;
//	ExtraBuyDTO xBuyDTO;
//	ProductDTO prodDTO;
	ProductDAO prodDAO;
	
	
	
	
	public double sumPriceTent() throws DALException{
		if(!(ProductDAO.getProduct(id)==null)){
			
			// skal gemme værdierne i en variable (double)
			
			//ProductDAO.getAmountOfAdults;		
			// ProductDAO.getAmountOf;	
		}
		
		return sumPriceTent();
	}
	
	public double sumPriceCaravan() throws DALException{
		if(!(ProductDAO.getProduct(id)==null)){
		
		// skal gemme værdierne i en variable (double)
		
		//	ProductDAO.getAmountOfAdults;		
		// ProductDAO.getAmountOf;	
		}
		return sumPriceCaravan();
	}
	
	public double sumPriceCabin() throws DALException{
		if(!(ProductDAO.getProduct(id)==null)){
			
		// skal gemme værdierne i en variable (double)
		// antal ekstra personer max 2. *100
			
		}
		
		
		return sumPriceCabin();
	}
	
	
	
	static void checkIn(){
		isCheckedIn = true;
	}
	
	static double checkOut(ReservationDTO res) throws DALException{
		//Reservation
		//ProductDTO
		//ExtraProductDTO
		//ExtraBuy
		
		amount = 0;
		
		double dog = 0;
		if(res.getDog()) amount = amount + dog;
		
		@SuppressWarnings("unused")
		ProductDTO product = ProductDAO.getProduct(res.getReservationID());
	
		
		
		@SuppressWarnings("unused")
		int id = res.getCustomerID();
		ArrayList<ExtraBuyDTO> XBuyDTOls = new ArrayList<ExtraBuyDTO>();
		
		for (@SuppressWarnings("unused") ExtraBuyDTO i : XBuyDTOls) {
			ExtraBuyDTO xBuyDTO = null;
			@SuppressWarnings("unused")
			ExtraProductDTO xProdDTO;
			@SuppressWarnings({ "null", "unused" })
			int xID = xBuyDTO.getEkstraProductID();
			@SuppressWarnings("unused")
			double xCon = xBuyDTO.getConsumption();
			
			amount = amount + xBuyDTO.getPrice();
		}
		
		
		receipt(res);
		return amount;
	}
	
	static void receipt(ReservationDTO res){
		
	}
}


