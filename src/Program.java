import java.awt.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        try{
            int[] a = new int[2];
            System.out.println(a[5]);
        }catch(Exception e){
            System.out.println("An error occured");
        }

        Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
        try{
            System.out.println(categories[choice]);
        }catch(Exception e){
            System.out.println("Wrong Option");
        }
    }
}