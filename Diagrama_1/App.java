public class App {

	public static void main(String[] args) {
		
		Figura retangulo = new Retangulo("Vermelho", 10.0, 20.0);
		
		Figura triangulo = new Triangulo("Roxo", 15, 10); 
		
		Figura circulo = new Circulo("Branco", 5);
		
		//Retangulo
		System.out.println(retangulo.toString());
		retangulo.area();
		
		//Triangulo
		System.out.println(triangulo.toString());
		triangulo.area();
		
		//Circulo
		System.out.println(circulo.toString());
		circulo.diametro();
		circulo.area();
	}

}
