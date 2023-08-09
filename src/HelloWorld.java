import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //Conditionals
        int age = 24;
        if(age >= 18) {
        System.out.println("Welcome");
        }else {
                System.out.println("Welcome!");
            }
        if(age > 0) {
        if(age > 16) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Too Young");
        }
        } else {
        System.out.println("Error");
        }

        if(age <= 0) {
            System.out.println("Error");
         }else if(age <= 16) {
            System.out.println("Too Young");
         } else if(age < 100) {
            System.out.println("Welcome!");
         } else {
            System.out.println("Really?");
         }

         Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
    }
}
