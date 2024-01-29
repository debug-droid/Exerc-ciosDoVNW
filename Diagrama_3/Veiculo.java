public class Veiculo implements Funcoes {
	
	private String placa;
	private int ano;
	private int quantidadeDePortas;
	private int quantidadeDeRodas;
	private double preco;
	private String tipo;
	
	public Veiculo() {
		
	}
	

	public Veiculo(String placa, int ano, int quantidadeDePortas, int quantidadeDeRodas, double preco, String tipo) {
		super();
		this.placa = placa;
		this.ano = ano;
		this.quantidadeDePortas = quantidadeDePortas;
		this.quantidadeDeRodas = quantidadeDeRodas;
		this.preco = preco;
		this.tipo = tipo;
	}
	
	

	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}


	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}


	public int getQuantidadeDeRodas() {
		return quantidadeDeRodas;
	}


	public void setQuantidadeDeRodas(int quantidadeDeRodas) {
		this.quantidadeDeRodas = quantidadeDeRodas;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public void ligar() {
			System.out.println("Ligando...");				
	}

	@Override
	public void desligar() {
		System.out.println("Desligando...");		
	}

	@Override
	public void andar() {
		System.out.println("Andando...");		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando...");		
	}

	@Override
	public void parar() {
		System.out.println("Parando...");
		
	}

	
	public String exibirDados() {
		return "Veiculo de placa = " + placa + ",\n ano = " + ano + ",\n quantidade De Portas = " + quantidadeDePortas
				+ ",\n quantidade De Rodas = " + quantidadeDeRodas + ",\n preco = " + preco + ",\n tipo = " + tipo + "]";
	}
    
}
