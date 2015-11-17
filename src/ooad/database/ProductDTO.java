package ooad.database;

import java.io.Serializable;

public class ProductDTO implements Serializable{
 
	int ProductID;                    
	String Name;
	int NumberOfAdults;				
	int NumberOfChildren;
	double PriceHighSeason;
	double PriceLowSeason;
	
	public ProductDTO(int ProduktID, String navn, int AntalVoksne, int AntalBørn, 
									double PrisHøjSæson, double PrisLavSæson)
	{
		this.ProductID = ProduktID;
		this.Name = navn;
		this.NumberOfAdults = AntalVoksne;
		this.NumberOfChildren = AntalBørn;
		this.PriceHighSeason = PrisHøjSæson;
		this.PriceLowSeason = PrisLavSæson;
	}	
	
	public int getProduktID() {return ProductID;}
	public void setProduktID(int ProduktID){this.ProductID = ProduktID;}
	public String getNavn() {return Name;}
	public void setNavn(String Navn) {this.Name = Navn;}
	public int AntalVoksne() {return NumberOfAdults;}
	public void setAntalVoksne(int AntalVoksne) {this.NumberOfAdults = AntalVoksne;}
	public int AntalBørn() {return NumberOfChildren;}
	public void setAntalBørn(int AntalBørn) {this.NumberOfChildren = AntalBørn;}
	public double PrisHøjSæson() {return PriceHighSeason;}
	public void setPrisHøjSæson(double PrisHøjSæson) {this.PriceHighSeason = PrisHøjSæson;}
	public double PrisLavHøjSæson() {return PriceLowSeason;}
	public void setPrisLavSæson(double PrisLavSæson) {this.PriceLowSeason = PrisLavSæson;}
	
}
