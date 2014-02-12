package br.com.k21.vendasdojo;

public class CalculadoraComissao {
	
	public static double calculaComissao(double valorVenda){
		double calculado = valorVenda * 5 / 100 ;
		return Math.floor(calculado * 100) / 100;
	}

}
