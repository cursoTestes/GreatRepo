package br.com.k21.vendasdojo.controle;

import java.util.List;

import br.com.k21.vendasdojo.ws.VendaWebService;


public class CalculadoraRoyalties {

	private CalculadoraComissao calculadoraComissao;
    private VendaWebService webService;

	
	
	public CalculadoraRoyalties(VendaWebService venda) {
		webService = venda;
	}



	public double calcularRoyalties(int mes, int ano) {
		List<Double> vendas = webService.recuperaVendas(mes, ano);
		double faturamento = 0d;
		
		for(Double venda : vendas) {
			faturamento += (venda - new CalculadoraComissao().calculaComissao(venda));			
		}
		
		return faturamento * 0.2;
	}
}
