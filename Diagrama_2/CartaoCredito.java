public class CartaoCredito implements Pagamento {
	
	private String numeroCartao;
	private String titular;
	private String agencia;
	private String conta;
	
	public CartaoCredito() {
		
	}

	public CartaoCredito(String numeroCartao, String titular, String agencia, String conta) {
		super();
		this.numeroCartao = numeroCartao;
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	@Override
	public void efetuarPagamento(double valor) {
		System.out.println("Pagamento no valor: " + valor + ", efetuado com sucesso.");
		
	}
	@Override
	public String toString() {
		return "[Número do cartão = " + numeroCartao + ",\n títular = " + titular + ",\n agência = " + agencia
				+ ",\n conta = " + conta + "]";
	}

}
