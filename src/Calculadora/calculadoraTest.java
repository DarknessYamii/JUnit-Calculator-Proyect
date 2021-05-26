package Calculadora;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(2,4); // 6
		int esperado = 6; // 2 + 4 = 6
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testResta() {
		int resultado = Calculadora.resta(5,3); // 2
		int esperado = 2; // 5 - 3 = 2
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testMultiplicar() {
		int resultado = Calculadora.multiplicar(5,5); // 25
		int esperado = 25; // 5 * 5 = 25
		assertEquals(esperado,resultado);
	}
	
	
	@Test
	public void testDividir() {
		int resultado = Calculadora.dividir(6,2); // 3
		int esperado = 3; // 6 / 2 = 3
		assertEquals(esperado,resultado);
	}
	
	
	// Descomentar si desea comprobar Test erroneos 
//	@Test
//	public void testSumaErroneo() {
//		int resultado = Calculadora.suma(3,4); // 7
//		int esperado = 6; // 3 + 4 != 6
//		assertEquals(esperado,resultado);
//	}
//	

}
