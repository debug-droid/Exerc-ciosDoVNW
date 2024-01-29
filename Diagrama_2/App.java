public class App {

	public static void main(String[] args) {
		
		Pagamento cartaozinho = new CartaoCredito("1234-4567-7890-0258", "Diego Augusto", "4568-0", "02587-9");
		
		Pagamento mandaPix = new Pix("81-99999-1111");
		
		
		System.out.println(cartaozinho.toString());
		
		cartaozinho.efetuarPagamento(350.85);
		mandaPix.efetuarPagamento(1325.35);
		System.out.println(mandaPix.toString());

	}

}