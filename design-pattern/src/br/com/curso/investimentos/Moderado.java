package br.com.curso.investimentos;
import java.util.Random;

import br.com.curso.model.Orcamento;

public class Moderado implements Investimento {

	@Override
	public double calcularInvestimento(Orcamento orcamento) {
		double resultado = 0;
		double chance = Math.ceil(new Random().nextDouble() * 10);
		System.out.println("Chance: " + chance);
		
		if (chance >= 0 && chance <= 5) {
			resultado = orcamento.getValor() + orcamento.getValor() * 0.25;
		}
		else if (chance > 5 && chance <= 10) {
			resultado = orcamento.getValor() + orcamento.getValor() * 0.007;
		}
		
		return resultado;
	}




}
