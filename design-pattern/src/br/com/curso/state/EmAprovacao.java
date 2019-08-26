package br.com.curso.state;


public class EmAprovacao implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontExtra(OrcamentoState orcamento) {
		if(!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		}
		else {
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

	@Override
	public void aprova(OrcamentoState orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(OrcamentoState orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento em aprovação não pode ir para finalizado diretamente");
		
	}



}
