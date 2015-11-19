package ooad.database;

@SuppressWarnings("serial")
public class TentsDTO extends ProductDTO {
	
	public TentsDTO(int productID, String name, int numberOfAdults,
			int numberOfChildren, double priceHighSeason,
			double priceLowSeason, double calculatePrice) {
		super(productID, name, numberOfAdults, numberOfChildren, priceHighSeason,
				priceLowSeason, calculatePrice);
			}
	public double calculatePrice(){
		return calculatePrice;	
	}
}