public class Triangulo implements Figura {
	
	private String cor;
	private double base;
	private double altura;
	
	public Triangulo() {
		
	}
	
	public Triangulo(String cor, double base, double altura) {
		super();
		this.cor = cor;
		this.base = base;
		this.altura = altura;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public void diametro() {
		
	}

	@Override
	public String toString() {
		return "O triângulo tem: [Cor = " + cor + ", base = " + base + ", altura = " + altura + "]";
	}

	@Override
	public void area() {
		System.out.println("A área do triângulo é: " + (this.base * this.altura) / 2);
	}
	
}
