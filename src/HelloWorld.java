import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //Array
        String[] names = new String[5];
        names[0] = "Jeisson";
        names[1] = "Javier";
        System.out.println(names[0]);
        String[ ] lastNames = { "A", "B", "C", "D"};
        System.out.println(names[2]);

        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option < 5){
            System.out.println(menu[option]);
        }else{
            System.out.println("Invalid");
        }
    }
}
