package net.nihan.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

public class NumberConversionSoapTypeTest {
	public NumberConversionSoapType servicio = new NumberConversion().getNumberConversionSoap();
	@Test
	public void testNumberToWords() {
		String ss= servicio.numberToDollars(new BigDecimal(2));
		System.out.println(ss);
		//assert(ss == "two dollars");
	}

	@Test
	public void testNumberToDollars() {
		String ss=servicio.numberToDollars(new BigDecimal(12.50));
		System.out.println(ss);
	//	assert(ss == "twelve dollars and fifty cents");
	}
	
	
	
}
