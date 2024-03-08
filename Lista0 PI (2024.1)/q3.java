// src/main/java/q3.java

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        resolverEquacaoSegundoGrau(a, b, c);

        scanner.close();
    }

    public static void resolverEquacaoSegundoGrau(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Coeficiente nao pode ser zero!");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("As raizes sao " + x1 + " e " + x2 + ".");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A unica raiz eh " + x + ".");
        } else {
            System.out.println("Nao ha raizes.");
        }
    }
}

