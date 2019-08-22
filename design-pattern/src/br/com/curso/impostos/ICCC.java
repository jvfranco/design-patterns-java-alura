package br.com.curso.impostos;
import br.com.curso.model.Orcamento;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000.0) {
			return orcamento.getValor() * 0.05;
		}
		if ((orcamento.getValor() >= 1000.0) && (orcamento.getValor() < 3000.0)) {
			return orcamento.getValor() * 0.07;
		}
		else {
			return orcamento.getValor() * 0.08 + 30;
		}
	}

}
