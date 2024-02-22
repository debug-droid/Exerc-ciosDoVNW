import java.util.Date;
import java.util.Scanner;

import br.com.classe_abstrata.ContaBancaria;
import br.com.contas.ContaCorrente;
import br.com.contas.ContaPoupanca;
import br.com.repositorio.RepositorioContaBancaria;

public class AppBank {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
    	
		int opcao;
		
		do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Editar Conta");
            System.out.println("4. Buscar Conta pelo número");
            System.out.println("5. Excluir conta");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                    	criarContaCorrente();
                        break;
                    case 2:
                        criarContaPoupanca();
                        break;
                    case 3:
                    	editarConta();
                        break;
                    case 4:
                    	buscarContaPeloNumero();
                        break;    
                    case 5:
                    	excluirConta();
                        break;    
                    case 6:
                        System.out.println("Obrigado por usar os nossos serviços.");
                        return;
                    default:
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
            }
        } while (true);

	}
	
	private static void buscarContaPeloNumero() {
		System.out.print("Número da Conta: ");
		int numero = sc.nextInt();
		ContaBancaria contaRetornada = RepositorioContaBancaria.buscarContaPeloNumero(numero);
		System.out.println(contaRetornada.toString());
	}

	
	private static void criarContaCorrente() {
		
		System.out.println("\nCadastro de Conta Corrente");
        System.out.print("Número da Conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.print("Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Nome do Titular: ");
        String nomeTitular = sc.nextLine();
        System.out.print("CPF do Titular: ");
        String cpfTitular = sc.nextLine();
        System.out.print("Limite de Crédito: ");
        String limiteCredito = sc.nextLine();
        ContaCorrente contaCorrente = new ContaCorrente(numero, agencia, nomeTitular, cpfTitular, limiteCredito);
        ContaBancaria contaCadastrada;
		try {
			contaCadastrada = RepositorioContaBancaria.adicionarContas(contaCorrente);
			System.out.println("Conta cadastrada com sucesso!");
			System.out.println("Os dados da sua conta são: " + contaCadastrada.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void criarContaPoupanca() {
        System.out.println("\nCadastro de Conta Poupança");
        System.out.print("Número da Conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.print("Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Nome do Titular: ");
        String nomeTitular = sc.nextLine();
        System.out.print("CPF do Titular: ");
        String cpfTitular = sc.nextLine();
        System.out.print("Data de Aniversário (dd/mm/aaaa): ");
        String dataAniversarioStr = sc.nextLine();
        Date dataAniversario = parseData(dataAniversarioStr);

        ContaPoupanca contaPoupanca = new ContaPoupanca(numero, agencia, nomeTitular, cpfTitular, dataAniversario);
        ContaBancaria contaCadastrada;
		try {
			contaCadastrada = RepositorioContaBancaria.adicionarContas(contaPoupanca);
			System.out.println("Conta cadastrada com sucesso!");
			System.out.println("Os dados da sua conta são: " + contaCadastrada.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	private static void editarConta() throws Exception {
	    System.out.print("Qual o número da conta para edição? ");
	    int numeroConta = sc.nextInt();
	    sc.nextLine();
	    
	    ContaBancaria conta = RepositorioContaBancaria.buscarContaPeloNumero(numeroConta);
	    if (conta != null) {
	        System.out.println("Conta encontrada: " + conta.toString());
	        if (conta instanceof ContaCorrente) {
	            System.out.print("Novo Limite de Crédito: ");
	            String novoLimite = sc.nextLine();
	            ((ContaCorrente) conta).setLimiteCredito(novoLimite);
	            System.out.println("Limite de Crédito atualizado com sucesso!");
	        } else if (conta instanceof ContaPoupanca) {
	            System.out.print("Nova Data de Aniversário (dd/mm/aaaa): ");
	            String novaDataStr = sc.nextLine();
	            Date novaData = parseData(novaDataStr);
	            ((ContaPoupanca) conta).setDataAniversario(novaData);
	            System.out.println("Data de Aniversário atualizada com sucesso!");
	        } else {
	            System.out.println("Tipo de conta não suportado para edição.");
	        }
	    } else {
	        throw new Exception("Conta não encontrada!");
	    }
	}

	
	private static void excluirConta() throws Exception {
		
		System.out.print("Qual o número da conta para exclusão? ");
	    int numeroConta = sc.nextInt();
	    ContaBancaria conta = RepositorioContaBancaria.buscarContaPeloNumero(numeroConta);
	    if (conta != null) {
	        boolean removido = RepositorioContaBancaria.excluirConta(conta);
	        if (removido) {
	            System.out.println("Conta excluída com sucesso!");
	        } else {
	            System.out.println("Erro ao excluir a conta.");
	        }
	    } else {
	        throw new Exception("Conta não encontrada!");
	    }
			
	}

    private static Date parseData(String dataStr) {
        // Implementação para converter uma string em uma data
        return new Date();
    }

}
