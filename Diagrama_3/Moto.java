
public class Moto extends Veiculo {

	private String placa;
	private int ano;
	private int quantidadeDePortas;
	private int quantidadeDeRodas;
	private double preco;
	private String tipo;
	private boolean ligada;
	
	public Moto() {
		this.ligada = false;
	}

	public Moto(String placa, int ano, int quantidadeDePortas, int quantidadeDeRodas, double preco, String tipo) {
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
		System.out.println("Ligando moto...");
		this.ligada = true;
	}

	@Override
	public void desligar() {
		if (ligada) {
			System.out.println("Desligando moto...");
		} else {
			System.out.println("Moto já está desligada.");
		}
		this.ligada = false;
	}

	@Override
	public void andar() {
			if(ligada) {
				System.out.println("Moto em movimento...");
			} else {
				System.out.println("Moto precisa estar ligada para andar.");
			}
	}

	@Override
	public void acelerar() {
		if(ligada ) {
			System.out.println("Moto acelerando...");
		} else {
			System.out.println("Moto precisa estar ligada para acelerar.");
		}
	}

	@Override
	public void parar() {
		if (ligada) {
			System.out.println("Moto parando...");
		} else {
			System.out.println("Moto precisa estar ligada para parar.");
		}
	}

	@Override
	public String exibirDados() {
		return "Placa da Moto = " + placa + ",\n ano = " + ano + ",\n quantidade De Portas = " + quantidadeDePortas
				+ ",\n quantidade De Rodas = " + quantidadeDeRodas + ",\n preco = " + preco + ",\n tipo = " + tipo + "]";
	}
}