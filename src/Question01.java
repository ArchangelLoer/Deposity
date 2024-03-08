import java.util.Scanner;

public class Question01 {
    public static double afim(int a, int b) {
        double Res = (double)-b / a;
        return Res;
    }

    public static void main(final String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int x, y;
        x = Scanner.nextInt();
        y = Scanner.nextInt();
        double resultado = afim(x,y);
        System.out.println(resultado);
    }
}