import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class DevBackEnd extends Colaborador {

	public DevBackEnd() {
		super();
	}
	
	public DevBackEnd(String nome, String cpf, String rg, double salario, String matricula, String genero,
			Date dataDeContratacao, String modeloDeContratacao, String senioridade, boolean estaAtivo) {
		super(nome, cpf, rg, salario, matricula, genero, dataDeContratacao, modeloDeContratacao, senioridade, estaAtivo);
	}
	

	@Override
	public void calcularValeTransporte() {
		double desconto = getSalario() * 0.06;
	    setSalario(getSalario() - desconto);
	}

	@Override
	public void calcularValeRefeicao() {
		double desconto = getSalario() * 0.03;
		setSalario(getSalario() - desconto);
	}

	@Override
	public void calcularFgts() {
		double desconto = getSalario() * 0.08;
		setSalario(getSalario() - desconto);
	}

	@Override
	public void calcularDecimoTerceiro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto é o seu salário? ");
		double salario = sc.nextDouble();
		double decimoTerceiro = (salario / 2);
		System.out.println("A primeira parcela é: " + decimoTerceiro);
		if (salario <= 1500.0) {
			double desconto = salario * 0.09;
		    decimoTerceiro -= desconto;
		    System.out.println("Sua segunda parcela é: " + formatarDuasCasasDecimais(decimoTerceiro));
		} else if (salario > 1500.0 && salario <= 2500.0) {
			double desconto = salario * 0.16;
		    decimoTerceiro -= desconto; 
		    System.out.println("Sua segunda parcela é: " + formatarDuasCasasDecimais(decimoTerceiro));
		} else if (salario > 2500.0 && salario <= 4000.0) {
			double desconto = salario * 0.29;
		    decimoTerceiro -= desconto;
		    System.out.println("Sua segunda parcela é: " + formatarDuasCasasDecimais(decimoTerceiro));
		}
		
		sc.close();
		
	}
	
	private String formatarDuasCasasDecimais(double valor) {
	    DecimalFormat formato = new DecimalFormat("#0.00");
	    return formato.format(valor);
	}
	
	@Override
	public void visualizar() {
		System.out.println("[Colaborador: " + getNome() + ", do CPF: " + getCpf() + " ]" + "\nSalario: " + formatarDuasCasasDecimais(getSalario())
				+ "\nMatricula: " + getMatricula() + "\nGênero: " + getGenero() + "\nContratado no dia: " + getDataDeContratacao()+ "\nNa modalidade: " +
				getModeloDeContratacao() + "\nSenioridade: " + getSenioridade() + "\nStatus: " + (getEstaAtivo() ? "Vinculado" : "Sem vinculo"));
	}

	@Override
	public void demitir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tem certeza que deseja desvincular " + getNome());
		Character resposta = sc.next().toLowerCase().charAt(0);
		if(resposta.equals('s')) {
			System.out.println(getNome() + ", você está demitido(a) e livre para o mercado de trabalho.");
			this.estaAtivo = false;
			salario = 0.0;
		}
		
		sc.close();
	}

}

