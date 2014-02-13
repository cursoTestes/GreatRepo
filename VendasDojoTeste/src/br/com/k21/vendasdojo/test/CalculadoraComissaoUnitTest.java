package br.com.k21.vendasdojo.test;

import junit.framework.TestCase;
import br.com.k21.vendasdojo.controle.CalculadoraComissao;

public class CalculadoraComissaoUnitTest extends TestCase {

	private CalculadoraComissao calculadoraComissao;
	
	@Override
	protected void setUp() throws Exception {
		calculadoraComissao = new CalculadoraComissao();
	}
	
	public void testVenda100comissaoEsperada5() {
		double valorVenda = 100;
		double valorEsperado = 5;
		
		double resultado = calculadoraComissao.calculaComissao(valorVenda); 
				
		assertEquals(valorEsperado, resultado);
	}
	
	public void testVenda10000comissaoEsperada500() {
		double valorVenda = 10000;
		double valorEsperado = 500;
		
		double resultado = calculadoraComissao.calculaComissao(valorVenda);
		
		assertEquals(valorEsperado, resultado);
	}
	
	public void testVenda0ComissaoEsperada0() {
		double valorVenda = 0;
		double valorEsperado = 0;
		
		double resultado = calculadoraComissao.calculaComissao(valorVenda);
		
		assertEquals(valorEsperado, resultado);	
	}
	
	public void testVenda1ComissaoEsperada5cents() {
		double valorVenda = 1;
		double valorEsperado = 0.05;
		
		double resultado = calculadoraComissao.calculaComissao(valorVenda);
		
		assertEquals(valorEsperado, resultado);	
	}
	
	public void testVenda55reais59centavosComissaoEsperada2reais77cents() {
		double valorVenda = 55.59;
		double valorEsperado = 2.77;
		
		double resultado = calculadoraComissao.calculaComissao(valorVenda);
		
		assertEquals(valorEsperado, resultado);	
	}	
}