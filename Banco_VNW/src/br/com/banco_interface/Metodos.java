package br.com.banco_interface;

import br.com.classe_abstrata.ContaBancaria;

public interface Metodos {

	public void sacar(double valor);

	public void depositar(double valor);

	public void transferir(ContaBancaria contaDestino, double valor);

}
