public class Retangulo implements Figura{
	
	private String cor;
	private double comprimento;
	private double altura;
	
	public Retangulo() {
		
	}
	
	public Retangulo(String cor, double comprimento, double altura) {
		super();
		this.cor = cor;
		this.comprimento = comprimento;
		this.altura = altura;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area(double comprimento, double altura) {
		return comprimento * altura;
	}
	
	
	
	@Override
	public void diametro() {
		
	}

	@Override
    public String toString() {
        return "O retângulo tem: [Cor = " + cor + ", comprimento = " + comprimento + ", altura = " + altura + "]";
    }

	@Override
	public void area() {
		System.out.println("A área do retângulo é: " + getComprimento() * getAltura());
	}
	
}
