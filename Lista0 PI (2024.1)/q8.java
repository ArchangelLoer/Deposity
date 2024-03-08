// src/main/java/q7.java

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do triângulo (entre 2 e 20): ");
        int altura = scanner.nextInt();

        if (altura < 2 || altura > 20) {
            System.out.println("Altura inválida!");
        } else {
            desenharTrianguloIsosceles(altura);
        }

        scanner.close();
    }

    public static void desenharTrianguloIsosceles(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
