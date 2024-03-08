// src/main/java/q5.java

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacidadeMochila = 18;
        int pesoLivro;
        int totalLivros = 0;
        
        while (true) {
            System.out.print("Digite o peso do livro (ou -1 para parar): ");
            pesoLivro = scanner.nextInt();

            if (pesoLivro == -1 || capacidadeMochila - pesoLivro < 0) {
                break;
            }

            capacidadeMochila -= pesoLivro;
            totalLivros++;
        }

        System.out.println("Total de livros que podem ser carregados: " + totalLivros);

        scanner.close();
    }
}
