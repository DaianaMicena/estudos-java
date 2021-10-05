package com.java;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Daiana";
		contaCorrente.cliente.idade = 34;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 40;/ 
		contaPoupanca.cliente.nome = "Joao";
		contaPoupanca.cliente.idade = 24;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 50;
		contaInvestimento.cliente.nome = "Abreu";
		contaInvestimento.cliente.idade = 54;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
		
	}

}
