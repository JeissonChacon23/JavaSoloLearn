import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Animal a = new Animal("Robby");
        Animal a1 = new Animal("Robby");
        System.out.println(a == a1);
        System.out.println(a.equals(a1));
    }
}