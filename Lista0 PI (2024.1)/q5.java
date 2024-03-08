// src/main/java/q5.java

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano da primeira dose: ");
        int anoPrimeiraDose = scanner.nextInt();

        System.out.print("Digite o intervalo em anos da vacina: ");
        int intervalo = scanner.nextInt();

        if (intervalo <= 0) {
            System.out.println("Digite um periodo maior que zero!");
        } else {
            calcularProximasDoses(anoPrimeiraDose, intervalo);
        }

        scanner.close();
    }

    public static void calcularProximasDoses(int anoPrimeiraDose, int intervalo) {
        System.out.println("Próximas doses:");

        for (int i = 1; i <= 3; i++) {
            anoPrimeiraDose += intervalo;
            System.out.println(anoPrimeiraDose);
        }
    }
}
