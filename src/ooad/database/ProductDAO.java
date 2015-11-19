package ooad.database;

import java.util.ArrayList;

public interface ProductDAO {
	ProductDTO getProduct(int ProduktsID) throws DALException;
	ArrayList<ProductDTO> getProdukts() throws DALException;
	void createProdukt(ProductDTO produkt) throws DALException;
	void updateProdukt(ProductDTO produkt) throws DALException;
	
}
