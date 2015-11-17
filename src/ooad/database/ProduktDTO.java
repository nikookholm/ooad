package ooad.database;

import java.io.Serializable;

public class ProduktDTO implements Serializable{
 
	int ProduktID;                    
	String Navn;
	int AntalVoksne;				
	int AntalBørn;
	double PrisHøjSæson;
	double PrisLavSæson;
	
	
	public ProduktDTO(int ProduktID, String navn, int AntalVoksne, int AntalBørn, 
									double PrisHøjSæson, double PrisLavSæson)
	{
		this.ProduktID = ProduktID;
		this.Navn = navn;
		this.AntalVoksne = AntalVoksne;
		this.AntalBørn = AntalBørn;
		this.PrisHøjSæson = PrisHøjSæson;
		this.PrisLavSæson = PrisLavSæson;
		
	}
	
	public int getProduktID() {return ProduktID;}
	public void setProduktID(int ProduktID){this.ProduktID = ProduktID;}
	public String getNavn() {return Navn;}
	public void setNavn(String Navn) {this.Navn = Navn;}
	public int AntalVoksne() {return AntalVoksne;}
	public void setAntalVoksne(int AntalVoksne) {this.AntalVoksne = AntalVoksne;}
	public int AntalBørn() {return AntalBørn;}
	public void setAntalBørn(int AntalBørn) {this.AntalBørn = AntalBørn;}
	public double PrisHøjSæson() {return PrisHøjSæson;}
	public void setPrisHøjSæson(double PrisHøjSæson) {this.PrisHøjSæson = PrisHøjSæson;}
	public double PrisLavHøjSæson() {return PrisLavSæson;}
	public void setPrisLavSæson(double PrisLavSæson) {this.PrisLavSæson = PrisLavSæson;}
	
}
