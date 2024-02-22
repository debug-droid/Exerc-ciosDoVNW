package br.com.classe_abstrata;

import br.com.banco_interface.Metodos;

public abstract class ContaBancaria implements Metodos{
	
	protected int numero;
    protected String agencia;
    protected String nomeTitular;
    protected String cpfTitular;
    protected double saldo;
    
    public ContaBancaria(int numero, String agencia, String nomeTitular, String cpfTitular) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = 0.0;
    }
    
    public int getNumero() {
		return numero;
	}
    
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract void transferir(ContaBancaria contaDestino, double valor);

	@Override
	public String toString() {
		return "Conta bancaria [numero: " + numero + ", agencia: " + agencia + ", nome do titular: " + nomeTitular
				+ ", cpf do titular: " + cpfTitular + ", saldo: " + saldo + "]";
	}
	
}
