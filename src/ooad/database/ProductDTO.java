package ooad.database;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductDTO implements Serializable{
 
	private int productID;                    
	private String name;
	private int numberOfAdults;				
	private int numberOfChildren;
	private double priceHighSeason;
	private double priceLowSeason;
	
	public ProductDTO()	{ }
	
	public ProductDTO(int productID, String name, int numberOfAdults, int numberOfChildren, 
					double priceHighSeason, double priceLowSeason)
	{
		this.productID = productID;
		this.name = name;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildren = numberOfChildren;
		this.priceHighSeason = priceHighSeason;
		this.priceLowSeason = priceLowSeason;
	}	
	public int getProductID() {return productID;}
	public String getName() {return name;}
	public int numberOfAdults() {return numberOfAdults;}
	public int numberOfChildren() {return numberOfChildren;}
	public double priceHighSeason() {return priceHighSeason;}
	public double priceLowSeason() {return priceLowSeason;}

	public double calculatePrice() {
		return 0;
	}
}

