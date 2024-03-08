// src/main/java/q1.java

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o volume: ");
        int volume = scanner.nextInt();

        String descricao = descricaoVolume(volume);
        System.out.println(descricao);

        scanner.close();
    }

    public static String descricaoVolume(int volume) {
        if (volume <= 0) {
            return "Min Volume";
        } else if (volume <= 25) {
            return "Low Volume";
        } else if (volume <= 75) {
            return "Medium Volume";
        } else if (volume < 100) {
            return "High Volume";
        } else {
            return "Max Volume";
        }
    }
}
