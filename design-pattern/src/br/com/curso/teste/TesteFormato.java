package br.com.curso.teste;

import br.com.curso.model.Conta;
import br.com.curso.retornoFormato.Formato;
import br.com.curso.retornoFormato.Requisicao;

public class TesteFormato {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Joao", 1500);
		Conta conta2 = new Conta("Pedro", 2000);
		Conta conta3 = new Conta("Luis", 2500);
		
		Requisicao requisicao = new Requisicao();
		
		System.out.println(requisicao.requisicao(Formato.CSV, conta1));
		System.out.println(requisicao.requisicao(Formato.XML, conta2));
		System.out.println(requisicao.requisicao(Formato.PORCENTO, conta3));
		
		
	}

}
