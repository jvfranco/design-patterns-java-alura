package br.com.curso.investimentos;
import br.com.curso.model.Orcamento;

public class Conservador implements Investimento {

	@Override
	public double calcularInvestimento(Orcamento orcamento) {
		return orcamento.getValor() + (orcamento.getValor() * 0.008);
	}
	
	
	
}
