package br.com.contas;

import br.com.classe_abstrata.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

	private String limiteCredito;
	
	
	public ContaCorrente(int numero, String agencia, String nomeTitular, String cpfTitular, String limiteCredito) {
        super(numero, agencia, nomeTitular, cpfTitular);
        this.limiteCredito = limiteCredito;
    }
	
	 public String getLimiteCredito() {
	        return limiteCredito;
	    }

	    public void setLimiteCredito(String limiteCredito) {
	        this.limiteCredito = limiteCredito;
	    }
	    
	    @Override
	    public void sacar(double valor) {
	    	double limiteCreditoParaDouble = Double.parseDouble(limiteCredito);
	        if (valor > saldo + limiteCreditoParaDouble) {
	            System.out.println("Saldo insuficiente!");
	        } else if(valor > 0) {
	        	saldo -= valor;
	        }
	        System.out.println("Saque efetuado com sucesso.");
	        System.out.println("Seu saldo é: " + saldo);
	    }

	    @Override
	    public void depositar(double valor) {
	        saldo += valor;
	    }

	    @Override
	    public void transferir(ContaBancaria contaDestino, double valor) {
	        sacar(valor);
	        contaDestino.depositar(valor);
	    }

		@Override
		public String toString() {
			return "Conta bancaria [numero: " + numero + ", agencia: " + agencia + ", nome do titular: " + nomeTitular
					+ ", cpf do titular: " + cpfTitular + ", saldo: " + saldo + ", limite de crédito: " + limiteCredito + "]";
		}
		
	    
}
