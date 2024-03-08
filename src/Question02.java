import java.util.Scanner;

public class Question02 {

    public static void tabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" x "+i+" = "+num * i);
        }
    }

    public static void main(final String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int x;
        x = Scanner.nextInt();
                tabuada(x);
    }

}