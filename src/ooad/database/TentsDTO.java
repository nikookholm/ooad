package ooad.database;

public class TentsDTO extends ProductDTO {

	public TentsDTO(int ProductID, String Name, int NumberOfAdults,
			int NumberOfChildren, double PriceHighSeason,
			double PriceLowSeason, double CalculatePrice) {
			super(ProductID, Name, NumberOfAdults, NumberOfChildren, PriceHighSeason,
				PriceLowSeason, CalculatePrice);
		}
	
	public double calculatePrice(){
		return calculatePrice;
		
	}
	}