// src/main/java/q4.java

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        determinarSigno(dia, mes, ano);

        scanner.close();
    }

    public static void determinarSigno(int dia, int mes, int ano) {
        boolean bissexto = ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            System.out.println("Data Invalida");
            return;
        }

        switch (mes) {
            case 4: case 6: case 9: case 11:
                if (dia > 30) {
                    System.out.println("Data Invalida");
                    return;
                }
                break;
            case 2:
                if (bissexto && dia > 29) {
                    System.out.println("Data Invalida");
                    return;
                } else if (!bissexto && dia > 28) {
                    System.out.println("Data Invalida");
                    return;
                }
                break;
        }

        String signo = "";
        switch (mes) {
            case 1:
                if (dia >= 20) signo = "Aquario";
                else signo = "Capricornio";
                break;
            case 2:
                if (dia >= 19) signo = "Peixes";
                else signo = "Aquario";
                break;
            case 3:
                if (dia >= 21) signo = "Aries";
                else signo = "Peixes";
                break;
            case 4:
                if (dia >= 21) signo = "Touro";
                else signo = "Aries";
                break;
            case 5:
                if (dia >= 21) signo = "Gemeos";
                else signo = "Touro";
                break;
            case 6:
                if (dia >= 22) signo = "Cancer";
                else signo = "Gemeos";
                break;
            case 7:
                if (dia >= 23) signo = "Leao";
                else signo = "Cancer";
                break;
            case 8:
                if (dia >= 23) signo = "Virgem";
                else signo = "Leao";
                break;
            case 9:
                if (dia >= 23) signo = "Libra";
                else signo = "Virgem";
                break;
            case 10:
                if (dia >= 23) signo = "Escorpiao";
                else signo = "Libra";
                break;
            case 11:
                if (dia >= 22) signo = "Sagitario";
                else signo = "Escorpiao";
                break;
            case 12:
                if (dia >= 22) signo = "Capricornio";
                else signo = "Sagitario";
                break;
        }

        System.out.println(signo.toLowerCase());
    }
}
