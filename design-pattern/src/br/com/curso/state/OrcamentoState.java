package br.com.curso.state;

import br.com.curso.state.EmAprovacao;
import br.com.curso.state.EstadoDeUmOrcamento;

public class OrcamentoState {

	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual;
	
	public OrcamentoState(double valor) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	
	public void deposita(double valor) {
		this.valor += valor;		
	}
	
	public void aplicaDesconto() {
		estadoAtual.aplicaDescontExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
