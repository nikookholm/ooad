package ooad.database;

@SuppressWarnings("serial")
public class CabinsDTO extends ProductDTO {

	
	public CabinsDTO(int ProductID, String Name, int NumberOfAdults,
			int NumberOfChildren, double PriceHighSeason,
			double PriceLowSeason, double CalculatePrice) {
		super(ProductID, Name, NumberOfAdults, NumberOfChildren, PriceHighSeason,
				PriceLowSeason, CalculatePrice);
	}
	@Override
	public double calculatePrice(){
		return calculatePrice;
	}
}
