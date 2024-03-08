import java.util.Scanner;

public class Question03 {
    public static double areaParede(int hp, int lp){
        double ap = hp * lp;
        return ap;
    }
    public static double areaAzulejo(int ha, int la){
        double al = ha * la;
        return al;
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int hp, lp, ha, la;
        hp = Scanner.nextInt();
        lp = Scanner.nextInt();
        ha = Scanner.nextInt();
        la = Scanner.nextInt();
        double ap = areaParede(hp, lp);
        double al = areaAzulejo(ha, la);
        System.out.println(ap / al);

    }

}