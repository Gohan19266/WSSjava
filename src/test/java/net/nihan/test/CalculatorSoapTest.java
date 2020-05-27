package net.nihan.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

public class CalculatorSoapTest {
	public CalculatorSoap servicio = new Calculator().getCalculatorSoap(); 
	@Test
	public void testAdd() {
		int ss= servicio.add(2,2);
		System.out.println(ss);
		//assert(ss == "4");
	}

	@Test
	public void testSubtract() {
		int ss= servicio.subtract(12, 5);
		System.out.println(ss);
		//assert(ss == "7");
	}

	@Test
	public void testMultiply() {
		int ss= servicio.multiply(5, 6);
		System.out.println(ss);
		//assert(ss == "30");
	}

	@Test
	public void testDivide() {
		int ss= servicio.divide(2100, 2);
		System.out.println(ss);
		//assert(ss == "1050");
	}

}
