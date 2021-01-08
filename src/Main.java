
import java.util.Scanner;

//1021 URI
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float x;
        x = s.nextFloat();
        x += 0.0001;
        int v,v2;
        v = (int) x;
        v2 = v;
        System.out.println("NOTAS:");
        System.out.println((int)v/100 + " nota(s) de R$ 100.00");
        v = v%100;
        System.out.println((int)v/50 + " nota(s) de R$ 50.00");
        v = v%50;
        System.out.println((int)v/20 + " nota(s) de R$ 20.00");
        v = v%20;
        System.out.println((int)v/10 + " nota(s) de R$ 10.00");
        v = v%10;
        System.out.println((int)v/5 + " nota(s) de R$ 5.00");
        v = v%5;
        System.out.println((int)v/2 + " nota(s) de R$ 2.00");
        int f = (int)(((v%2) + (x-v2))*100);
        System.out.println("MOEDAS:");
        System.out.println((int)f/100 + " moeda(s) de R$ 1.00");
        f = f%100;
        System.out.println((int)f/50 + " moeda(s) de R$ 0.50");
        f = f%50;
        System.out.println((int)f/25 + " moeda(s) de R$ 0.25");
        f = f%25;
        System.out.println((int)f/10 + " moeda(s) de R$ 0.10");
        f = f%10;
        System.out.println((int)f/5 + " moeda(s) de R$ 0.05");
        f = f%5;
        System.out.println((int)f/1 + " moeda(s) de R$ 0.01");
    }
}