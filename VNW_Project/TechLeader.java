import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class TechLeader extends Colaborador {

	public TechLeader() {
		super();
	}
	
	public TechLeader(String nome, String cpf, String rg, double salario, String matricula, String genero,
			Date dataDeContratacao, String modeloDeContratacao, String senioridade, boolean estaAtivo) {
		super(nome, cpf, rg, salario, matricula, genero, dataDeContratacao, modeloDeContratacao, senioridade, estaAtivo);
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

