public class Circulo implements Figura {

	public String cor;
	private double raio;
	
	
	public Circulo() {
		
	}
	
	public Circulo(String cor, double raio) {
		super();
		this.cor = cor;
		this.raio = raio;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public void diametro() {
		System.out.println("O diametro do circulo é: " + raio * 2);
	}

	@Override
	public void area() {
		System.out.println("A área do circulo é: " + 3.14 * (Math.pow(getRaio(), 2)));
	}

	@Override
	public String toString() {
		return "Circulo [cor = " + cor + ", raio = " + raio + "]";
	}
    
}
