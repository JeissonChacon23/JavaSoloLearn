import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        //nextDouble(), nextFloat(), nextBoolean().
        System.out.println("Name: "+ name +"\nAge: "+ age);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println(amount * 0.15);
    }
}
