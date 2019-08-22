package br.com.curso.retornoFormato;

import br.com.curso.model.Conta;

public class FormatoPorcento implements Resposta {

	@Override
	public String responde(Formato requisicao, Conta conta) {
		if (requisicao.equals(Formato.PORCENTO)) return "%" + conta.getNome() + "%" + conta.getSaldo() + "%";
		else throw new RuntimeException();
	}

	@Override
	public void setProxima(Resposta resposta) {
		//Nao ha proxima
	}

}
