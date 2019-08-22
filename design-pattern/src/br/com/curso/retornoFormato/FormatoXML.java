package br.com.curso.retornoFormato;

import br.com.curso.model.Conta;

public class FormatoXML implements Resposta {

	private Resposta resposta;

	@Override
	public String responde(Formato requisicao, Conta conta) {
		if (requisicao.equals(Formato.XML)) return "<conta><titular>" + conta.getNome() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>";
		else return resposta.responde(requisicao, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}
	
	

}
