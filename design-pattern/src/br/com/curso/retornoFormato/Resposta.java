package br.com.curso.retornoFormato;

import br.com.curso.model.Conta;

public interface Resposta {
	
	public String responde(Formato formato, Conta conta);
	public void setProxima(Resposta resposta);
	
}
