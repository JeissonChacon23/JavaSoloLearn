import java.awt.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program {
    public void hacer(int x) throws IOException{
                if(x < 0){
                    throw new IOException();
                }
            }


    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }



        public static void main(String[] args){
        System.out.println(div(42, 0));

        Scanner scanner = new Scanner(System.in);
	    
	    try {
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        /*
	        1. Error: division by zero
	        2. Error: wrong value type
	        */
	        //your code goes here
			System.out.println(num1/num2);
	    } catch(ArithmeticException a1) {
	        System.out.println("Error: division by zero");
	    } catch(InputMismatchException e2){
	        System.out.println("Error: wrong value type");
	    }
    }
}