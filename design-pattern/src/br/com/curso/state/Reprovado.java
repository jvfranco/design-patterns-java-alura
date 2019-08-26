package br.com.curso.state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontExtra(OrcamentoState orcamento) {
		
	}

	@Override
	public void aprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento reprovado, não há novos descontos");
		
	}

	@Override
	public void reprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento reprovado, não há novos descontos");		
	}

	@Override
	public void finaliza(OrcamentoState orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}



}
