package megasena;

import java.util.Random;
import java.util.Scanner;

public class Megasena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ramdon = new Random();

        int tamanhoDoVetor = 7;

        // vetor que armazena os números escolhidos pelo usuário
        int[] numerosEscolhidos = new int[tamanhoDoVetor];

        // solicita ao usuário que escolha 7 números
        for(int i = 0; i < tamanhoDoVetor; i++) {
            boolean entradaValida = false;
            do {
                System.out.println("digite o número " + (i + 1) + " (entre 0 e 100): ");
                if(sc.hasNextInt()) {
                    numerosEscolhidos[i] = sc.nextInt();
                    if(numerosEscolhidos[i] >= 0 && numerosEscolhidos[i] <= 100) {
                        entradaValida = true;
                    } else {
                        System.out.print("Por favor, digite um número entre 0 e 100.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    sc.next(); // limpa o buffer do scanner
                }
            } while (!entradaValida);
        }

        // gera 7 números vencedores aleatoriamente
        int[] numerosVencedores = new int[tamanhoDoVetor];
        for(int i = 0; i < tamanhoDoVetor; i++) {
            numerosVencedores[i] = ramdon.nextInt(101);
        }

        // imprime os números escolhidos pelo usuário
        System.out.println("Os números escolhidos pelo usuário são: ");
        for(int numero : numerosEscolhidos) {
            System.out.print(numero + " ");
        }
        // pula uma linha
        System.out.println();

        // imprime os números vencedores
        System.out.println("Os números vencedores são: ");
        for (int numero : numerosVencedores) {
            System.out.print(numero + " ");
        }
        // pula uma linha
        System.out.println();

        // verifica quantos números o usuário acertou
        int numerosAcertados = 0;
        for(int i = 0; i < tamanhoDoVetor; i++) {
            if(numerosEscolhidos[i] == numerosVencedores[i]) {
                numerosAcertados++;
            }
        }

        // mensagem do prêmio com base no número de acertos
        if(numerosAcertados == 7) {
            System.out.println("Parabéns! Você acertou todos os 7 números. Prêmio de 200 mil reais!");
        } else if(numerosAcertados == 6) {
            System.out.println("Parabéns! Você acertou 6 números. Prêmio de 50 mil reais!");
        } else if(numerosAcertados == 5) {
            System.out.println("Parabéns! Você acertou 5 números. Prêmio de 10 mil reais!");
        } else {
            System.out.println("Não foi dessa vez. Tente novamente.");
        }

        sc.close();
    }
}
