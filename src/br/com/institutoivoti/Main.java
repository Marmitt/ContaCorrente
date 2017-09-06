package br.com.institutoivoti;

import br.com.institutoivoti.lib.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Cadastro de conta");
		Conta conta = new Conta();
		conta.Credito(20000);
		conta.ImprimeDados();
	}
}
