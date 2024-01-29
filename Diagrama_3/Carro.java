public class Carro extends Veiculo {
	
	private String placa;
	private int ano;
	private int quantidadeDePortas;
	private int quantidadeDeRodas;
	private double preco;
	private String tipo;
	private boolean ligado;
	
	public Carro() {
		this.ligado = false;
	}	
	
	public Carro(String placa, int ano, int quantidadeDePortas, int quantidadeDeRodas, double preco, String tipo) {
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
		System.out.println("Ligando carro...");
		this.ligado = true;
	}

	@Override
	public void desligar() {
		if(ligado) {
			System.out.println("Desligando carro...");
		} else {
			System.out.println("O carro já está desligado.");
		}
		this.ligado = false;
	}

	@Override
	public void andar() {
			if(ligado) {
				System.out.println("Carro em movimento...");
			} else {
				System.out.println("O carro está desligado. Ligue o carro para poder andar.");
			}
	}

	@Override
	public void acelerar() {
		if(ligado) {
			System.out.println("Acelerando o carro...");
		} else {
			System.out.println("O carro está desligado. Ligue o carro para poder acelerar.");
		}
	}

	@Override
	public void parar() {
		if(ligado) {
			System.out.println("Carro parando...");
		} else {
			System.out.println("O carro está desligado. Ligue o carro para poder andar.");
		}
	}

	@Override
	public String exibirDados() {
		return "Placa do Carro = " + placa + ",\n ano = " + ano + ",\n quantidade De Portas = " + quantidadeDePortas
				+ ",\n quantidade De Rodas = " + quantidadeDeRodas + ",\n preco = " + preco + ",\n tipo = " + tipo + "]";
	}
	
	
	
}
