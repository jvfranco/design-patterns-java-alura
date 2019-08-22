package br.com.curso.impostos;
import br.com.curso.model.Orcamento;

public class NewImposto implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.09;
	}

}
