import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = Math.abs(10);
        int b = Math.abs(-20); //The absolute value 20
        System.out.println("A: "+ a +"\nB: "+b);
        double c = Math.ceil(7.342);  // Rounds a floating point value up 8.0
        double f = Math.floor(7.343);  // Rounds a floating point value down 7.0
        int m = Math.max(10, 20);  // Retunr the largest of its parameters 20
        int n = Math.min(10, 20); // Return the smallest parameter 10
        double p = Math.pow(2, 3); // Takes two parameters and returns the first parameter raised to the power of the second parameter 8.0

        //Quiz
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        System.out.println(Math.pow(num1, num2));
        System.out.println(Math.abs(Math.min(-6, 3)));
    }
}