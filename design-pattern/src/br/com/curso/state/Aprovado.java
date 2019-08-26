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
			throw new RuntimeException("Desconto j� foi aplicado!");
		}
		
	}

	@Override
	public void aprova(OrcamentoState orcamento) {
		throw new RuntimeException("Or�amento j� est� em estado aprova��o");
		
	}

	@Override
	public void reprova(OrcamentoState orcamento) {
		throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");
		
	}

	@Override
	public void finaliza(OrcamentoState orcamento) {
		orcamento.estadoAtual = new Finalizado();		
	}

	
}
