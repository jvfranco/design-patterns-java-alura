package br.com.curso.state;


public class Aprovado implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontExtra(OrcamentoState orcamento) {
		if(!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;			
			descontoAplicado = true;
		}
		else {
			throw new RuntimeException("Desconto já foi aplicado!");
		}
		
	}

	@Override
	public void aprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento já está em estado aprovação");
		
	}

	@Override
	public void reprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
		
	}

	@Override
	public void finaliza(OrcamentoState orcamento) {
		orcamento.estadoAtual = new Finalizado();		
	}

	
}
