package br.com.curso.impostos;
import br.com.curso.model.Orcamento;

public class NewImposto extends Imposto {

	public NewImposto() {
	}
	
	public NewImposto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.09 + calculoDoOutroImposto(orcamento);
	}

}
