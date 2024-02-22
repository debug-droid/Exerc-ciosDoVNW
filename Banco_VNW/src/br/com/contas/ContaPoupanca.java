package br.com.contas;

import java.util.Calendar;
import java.util.Date;

import br.com.classe_abstrata.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
	
	private Date dataAniversario;
    private double taxaJurosMensal = 0.02;
    private double saldoUltimoDeposito;
    private int mesUltimoDeposito;
    private double taxa = 0.02;

    public ContaPoupanca(int numero, String agencia, String nomeTitular, String cpfTitular, Date dataAniversario) {
        super(numero, agencia, nomeTitular, cpfTitular);
        this.dataAniversario = dataAniversario;
        this.mesUltimoDeposito = -1; // Inicializa com um valor impossível de mês (-1)
    }
    
    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    
    public int getMesUltimoDeposito() {
		return mesUltimoDeposito;
	}

	public void setMesUltimoDeposito(int mesUltimoDeposito) {
		this.mesUltimoDeposito = mesUltimoDeposito;
	}

	@Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        }
        saldo -= valor - taxa;
    }

    @Override
    public void depositar(double valor) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int mesAtual = cal.get(Calendar.MONTH);

        if (mesAtual != mesUltimoDeposito) {
            // Adiciona juros apenas se o mês atual for diferente do mês do último depósito
            saldo += saldoUltimoDeposito * taxaJurosMensal;
            mesUltimoDeposito = mesAtual;
            saldoUltimoDeposito = 0.0;
        }

        saldoUltimoDeposito += valor;
        saldo += valor;
    }

    @Override
    public void transferir(ContaBancaria contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    
    
}
