package br.com.curso.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.curso.filtro.ContaSaldoMenorQueCemReais;
import br.com.curso.filtro.ContasSaldoMaiorQuinhentosMil;
import br.com.curso.filtro.FiltroDeContas;
import br.com.curso.model.Conta;

public class TesteContasFiltro {

	private static List<Conta> contasFiltradas;

	public static void main(String[] args) {
		FiltroDeContas filtro = new ContaSaldoMenorQueCemReais(new ContasSaldoMaiorQuinhentosMil());
		
		Conta conta1 = new Conta("Joao", 90.0);
		Conta conta2 = new Conta("Pedro", 80.0);
		Conta conta3 = new Conta("Luis", 1000000);
		Conta conta4 = new Conta("Juca", 1050000);
		Conta conta5 = new Conta("Juquinha", 50965);
		
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		contas.add(conta5);
		
		contasFiltradas = filtro.filtra(contas);
		
		System.out.println("Contas Suspeitas");
		contasFiltradas.forEach(c -> System.out.println(c));
		
	}
}
