package br.com.curso.impostos;
import br.com.curso.model.Orcamento;

public class ICCC extends Imposto {

	public ICCC() {}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000.0) {
			return orcamento.getValor() * 0.05 + calculoDoOutroImposto(orcamento);
		}
		if ((orcamento.getValor() >= 1000.0) && (orcamento.getValor() < 3000.0)) {
			return orcamento.getValor() * 0.07 + calculoDoOutroImposto(orcamento);
		}
		else {
			return orcamento.getValor() * 0.08 + 30 + calculoDoOutroImposto(orcamento);
		}
	}

}
