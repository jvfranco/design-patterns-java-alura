package br.com.curso.investimentos;
import java.util.Random;

import br.com.curso.model.Orcamento;



public class Arrojado implements Investimento {

	@Override
	public double calcularInvestimento(Orcamento orcamento) {
		double resultado = 0;
		double chance = Math.ceil(new Random().nextDouble() * 10);
		System.out.println("Chance: "+ chance);
		
		if(chance >= 0 && chance <= 2) {
			resultado = orcamento.getValor() + orcamento.getValor() * 0.05;
		}
		if(chance > 2 && chance <= 5) {
			resultado = orcamento.getValor() + orcamento.getValor() * 	0.03;
		}		
		else if (chance > 5 && chance <= 10) {
			resultado = orcamento.getValor() + orcamento.getValor() * 0.006;
		}
		
		return resultado;
	}

}
