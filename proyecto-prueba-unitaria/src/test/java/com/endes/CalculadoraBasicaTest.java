package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraBasicaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setup( -> beforeEach) antes de cada @Test");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba de la suma de la calculadora")
	void testSuma() {
		Integer resultadoEsperado = 3;
		Integer resultado = CalculadoraBasica.sumar(1,2);
		
		assertEquals(resultadoEsperado, resultado, "La suma no es correcta");
		
	}

	@Test
	@DisplayName("Prueba de la resta de la calculadora")
	void testResta() {
		Integer resultadoEsperado = 3;
		Integer resultado = CalculadoraBasica.restar(5,2);
		
		assertEquals(resultadoEsperado, resultado, "La resta no es correcta");
		
	}
	
	@Test
	@DisplayName("Prueba de la multiplicación de la calculadora")
	void testMultiplicacion() {
		Integer resultadoEsperado = 6;
		Integer resultado = CalculadoraBasica.multiplicar(3,2);
		
		assertEquals(resultadoEsperado, resultado, "La multiplicacion no es correcta");
		
	}
	
	@Test
	@DisplayName("Prueba de la division de la calculadora")
	void testDivision() {
		Integer resultadoEsperado = 5;
		Integer resultado = CalculadoraBasica.dividir(20,4);
		
		assertEquals(resultadoEsperado, resultado, "La division no es correcta");
		
	}
	
}
