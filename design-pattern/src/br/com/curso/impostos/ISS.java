package br.com.curso.impostos;
import br.com.curso.model.Orcamento;

public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
		
}
