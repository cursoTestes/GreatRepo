package br.com.k21.vendasdojo.controle;

public class CalculadoraComissao {
	
	public double calculaComissao(double valorVenda){
		double calculado = valorVenda * 5 / 100 ;
		return Math.floor(calculado * 100) / 100;
	}

}
