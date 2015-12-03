package ooad.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ooad.shared.FieldVerifier;

public class TestFieldVerifier {

	@Test
	public void testIsNameValid()
	{
		boolean actual = FieldVerifier.isNameValid(" ");
		
		assertFalse(actual);
		
	}
	
	@Test
	public void testIsValidNameLength()
	{
		boolean actual = FieldVerifier.isNameValid("qwertyuiopasdfghjklzx");
		
		assertTrue(actual);
		
	}
	
	@Test
	public void testIsValidName2Short()
	{
		boolean actual = FieldVerifier.isNameValid("x");
		
		assertFalse(actual);
		
	}
	
	@Test
	public void testStatusValidWith1(){
		
		boolean actual = FieldVerifier.isStatusValid("1");
		
		assertTrue(actual);
	}
	
	
	@Test
	public void testStatusValidWith4(){
		
		boolean actual = FieldVerifier.isStatusValid("4");
		
		assertFalse(actual);
	}
	
	@Test
	public void testStatusValidWith4ints(){
		
		boolean actual = FieldVerifier.isStatusValid("1854");
		
		assertFalse(actual);
	}
	
	@Test
	public void testStatusValidWithString(){
		
		boolean actual = FieldVerifier.isStatusValid("sldf");
		
		assertFalse(actual);
	}
	
	@Test
	public void testLettersOnlyVsInt(){
		
		boolean actual = FieldVerifier.isLettersOnly("132356643");
		
		assertFalse(actual);
		
	}
	
	@Test
	public void testLettersOnlyVsSymbols(){
		
		boolean actual = FieldVerifier.isLettersOnly("#€%&/(");
		
		assertFalse(actual);
		
	}
	
	@Test
	public void testLettersOnlyVsLetters(){
		
		boolean actual = FieldVerifier.isLettersOnly("fglsdjfgjsdj");
		
		assertTrue(actual);
		
	}
	
	@Test
	public void testValidEmailAdress(){
		
		boolean actual = FieldVerifier.isEmailAddressValid("Lars14@gmail.com");
		
		assertTrue(actual);
	}
	
	@Test 
	public void testUnvalidEmailAdress(){
		
		boolean actual = FieldVerifier.isEmailAddressValid("Lars14@gmailcom");
		
		assertFalse(actual);
	}
	
	@Test
	public void testUnvalidEmailAdressNoAt(){
		
		boolean actual = FieldVerifier.isEmailAddressValid("Lars14.Lars.com");
		
		assertFalse(actual);
	}
	
	@Test
	public void testIsAmountValid(){
		
		boolean actual = FieldVerifier.isValidAmount("5");
		
		assertTrue(actual);
	}
	
	@Test
	public void testIsAmount10Valid(){
		
		boolean actual = FieldVerifier.isValidAmount("10");
		
		assertTrue(actual);
	}
	
	@Test
	public void testIsAmount1Valid(){
		
		boolean actual = FieldVerifier.isValidAmount("1");
		
		assertTrue(actual);
	}
	
	@Test
	public void testIsAmountOver10Valid(){
		
		boolean actual = FieldVerifier.isValidAmount("11");
		
		assertFalse(actual);
	}
	
	@Test
	public void testIsAmountZeroValid(){
		
		boolean actual = FieldVerifier.isValidAmount("0");
		
		assertFalse(actual);
	}
	
	
}

