package br.com.k21.vendasdojo.test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import br.com.k21.vendasdojo.controle.CalculadoraRoyalties;
import br.com.k21.vendasdojo.ws.VendaWebService;

public class CalculadoraRoyaltiesUnitTest extends TestCase {

	public void testParaUmMesSemVendas() {
		int mes = 1;
		int ano = 2014;
		double esperado = 0;
		VendaWebService venda = mock(VendaWebService.class);
		
		double resultado = new CalculadoraRoyalties(venda).calcularRoyalties(mes,ano);
		
		assertEquals(esperado, resultado);
	}
	
	public void testParaUmMesComUmaVendaDe100() {
		int mes = 1;
		int ano = 2014;
		double esperado = 19;
		
		List<Double> vendas = new ArrayList<Double>();
		vendas.add(100d);
		
		VendaWebService venda = mock(VendaWebService.class);
		when(venda.recuperaVendas(mes, ano)).thenReturn(vendas);
		
		double resultado = new CalculadoraRoyalties(venda).calcularRoyalties(mes,ano);
		
		assertEquals(esperado, resultado);
	}

}
