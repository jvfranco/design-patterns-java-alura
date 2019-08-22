package br.com.curso.retornoFormato;

import br.com.curso.model.Conta;

public class Requisicao {
	
	public String requisicao(Formato requisicao, Conta conta) {
		Resposta r1 = new FormatoCSV();
		Resposta r2 = new FormatoXML();
		Resposta r3 = new FormatoPorcento();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		
		return r1.responde(requisicao, conta);
	}
	
}
