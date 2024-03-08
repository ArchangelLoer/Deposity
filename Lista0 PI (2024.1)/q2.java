// src/main/java/q2.java

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        ordenarDecrescente(num1, num2, num3);

        scanner.close();
    }

    public static void ordenarDecrescente(int num1, int num2, int num3) {
        int temp;

        // Ordenação usando o método de bubble sort
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println(num1 + " >= " + num2 + " >= " + num3);
    }
}
