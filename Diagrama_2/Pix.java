public class Pix implements Pagamento {
	
	private String chavePix;
	
	public Pix() {
		
	}

	public Pix(String chavePix) {
		super();
		this.chavePix = chavePix;
	}

	public String getChavePix() {
		return chavePix;
	}
	
	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	@Override
	public void efetuarPagamento(double valor) {
		System.out.println("Opa! Registramos um pagamento pix no valor de: " + valor);
	}

	@Override
	public String toString() {
		return "Esta é a minha chave pix: [" + chavePix + "]";
	}
		
}
