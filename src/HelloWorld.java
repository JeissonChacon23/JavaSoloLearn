import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //Method parameters
        welcome("Jeisson");
        demo(8, 3);
        convert(4);
    }

    static void welcome(String name){
        System.out.println("Welcome "+ name);
    }

    static void demo(int x, int y) {
        if(x<y) {
          System.out.println(x+y);
        } else {
          System.out.println(x%y);
        }
    }
    static void convert(double foot){
        double inche = foot * 12;
        System.out.println(inche);
    }
}


