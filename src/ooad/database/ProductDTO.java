package ooad.database;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductDTO implements Serializable{
 
	int productID;                    
	String name;
	int numberOfAdults;				
	int numberOfChildren;
	double priceHighSeason;
	double priceLowSeason;
	double calculatePrice;
	
	public ProductDTO(int productID, String name, int numberOfAdults, int numberOfChildren, 
					double priceHighSeason, double priceLowSeason, double calculatePrice)
	{
		this.productID = productID;
		this.name = name;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildren = numberOfChildren;
		this.priceHighSeason = priceHighSeason;
		this.priceLowSeason = priceLowSeason;
		this.calculatePrice = calculatePrice;
	}	
	
	public int getProduktID() {return productID;}
	public void setProduktID(int ProduktID){this.productID = ProduktID;}
	public String getNavn() {return name;}
	public void setNavn(String Navn) {this.name = Navn;}
	public int AntalVoksne() {return numberOfAdults;}
	public void setAntalVoksne(int AntalVoksne) {this.numberOfAdults = AntalVoksne;}
	public int AntalBørn() {return numberOfChildren;}
	public void setAntalBørn(int AntalBørn) {this.numberOfChildren = AntalBørn;}
	public double PrisHøjSæson() {return priceHighSeason;}
	public void setPrisHøjSæson(double PrisHøjSæson) {this.priceHighSeason = PrisHøjSæson;}
	public double PrisLavHøjSæson() {return priceLowSeason;}
	public void setPrisLavSæson(double PrisLavSæson) {this.priceLowSeason = PrisLavSæson;}
	public double CalculatePrice() {return calculatePrice;}
	public void setCalculatePrice(double CalculatePrice) {this.calculatePrice = CalculatePrice;}
	public double calculatePrice() {
		return 0;
	}
}
