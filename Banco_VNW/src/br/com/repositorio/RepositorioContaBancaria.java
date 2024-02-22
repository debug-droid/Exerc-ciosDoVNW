package br.com.repositorio;

import java.util.ArrayList;

import br.com.classe_abstrata.ContaBancaria;

public class RepositorioContaBancaria {

	private static ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
	
	public static ContaBancaria adicionarContas(ContaBancaria conta) throws Exception {
		boolean cadastroSucesso = contas.add(conta);
		if(cadastroSucesso) {
			return conta;
		} else {
			throw new Exception("Erro ao cadastrar conta.");
		}
		
	}
	
	public static ContaBancaria buscarContaPeloNumero(int numero) {
		return contas.stream()
		  .filter(conta -> conta.getNumero() == numero)
		  .findAny()
		  .orElse(null);
	}
	
	public static boolean excluirConta(ContaBancaria conta) {
		boolean removido = contas.remove(conta);
	    return removido;
	}
}
