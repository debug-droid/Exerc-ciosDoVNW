public class App {

	public static void main(String[] args) {
		
		Veiculo carro = new Carro("ABC-1234", 2020, 4, 4, 50.000, "Elétrico");
		Veiculo moto = new Moto("DEF-5678", 2022, 0, 2, 32.000, "Combustível");
		
		//Carro
		carro.ligar();
		carro.andar();
		carro.acelerar();
		carro.parar();
		carro.desligar();
		
		System.out.println("---------------------");
		
		//Moto
		moto.ligar();
		moto.andar();
		moto.acelerar();
		moto.parar();
		moto.desligar();

	}

}
