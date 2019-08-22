package br.com.curso.investimentos;
import br.com.curso.model.Orcamento;

public class RealizadorDeInvestimentos {
	
	public void calculoInvestimento(Orcamento orcamento, Investimento investimento) {
		double resultado = investimento.calcularInvestimento(orcamento);
		orcamento.deposita(resultado * 0.75);
		System.out.println("Novo valor: " + orcamento.getValor());
	}
	
	
}
