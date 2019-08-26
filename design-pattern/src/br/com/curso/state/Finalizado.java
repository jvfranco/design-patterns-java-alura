package br.com.curso.state;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontExtra(OrcamentoState orcamento) {
		
	}

	@Override
	public void aprova(OrcamentoState orcamento) {
		throw new RuntimeException("Or�amento finalizado, n�o pode ser aprovado novamente");
		
	}

	@Override
	public void reprova(OrcamentoState orcamento) {
		throw new RuntimeException("Or�amento finalizado, n�o pode ser reprovado");
		
	}

	@Override
	public void finaliza(OrcamentoState orcamento) {
		throw new RuntimeException("Or�amento j� est� finalizado");
		
	}

}
