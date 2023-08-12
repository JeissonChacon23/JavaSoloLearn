import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //The Switch statement
        int day = 2;

        switch(day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        }

        int x = 2;
        switch(x) {
        case 1: x = 2;
        case 2: x = 3;
        case 3: x = 4;
        }
        //System.out.println(null);
        switch(day) {
            case 1:
              System.out.println("Monday");
            case 2:
              System.out.println("Tuesday");
            case 3:
              System.out.println("Wednesday");
            default: 
              System.out.println("Another day");
          }

            int a = 11; int b = 12; int c = 40;
            switch (a) {
            case 40:
            System.out.println(b);
            break;
            default:
            System.out.println(c);
}
    }
}
