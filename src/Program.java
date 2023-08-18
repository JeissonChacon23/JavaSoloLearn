import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = (int) 3.14;    
        System.out.println(a);
        double b = 42.571;
        int c = (int) b;
        System.out.println(c);

        double n = 1.5;
        double m = 2.65;
        sum((int)n, (int)m);

        char x = read.next().charAt(0);
        int y = (int) x;
        System.out.println(y);
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
     }
}