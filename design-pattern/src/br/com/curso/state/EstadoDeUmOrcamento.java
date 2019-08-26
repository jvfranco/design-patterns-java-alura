package br.com.curso.state;


public interface EstadoDeUmOrcamento {

	void aplicaDescontExtra(OrcamentoState orcamento);
	
	void aprova(OrcamentoState orcamento);
	
	void reprova(OrcamentoState orcamento);
	
	void finaliza(OrcamentoState orcamento);
	
}
