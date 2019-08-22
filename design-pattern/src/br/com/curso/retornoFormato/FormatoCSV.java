package br.com.curso.retornoFormato;

import br.com.curso.model.Conta;

public class FormatoCSV implements Resposta {

	private Resposta resposta;

	@Override
	public String responde(Formato requisicao, Conta conta) {
		if (requisicao.equals(Formato.CSV)) return conta.getNome() + "," + conta.getSaldo();
		else return resposta.responde(requisicao, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}
}
