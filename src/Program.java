import java.util.Scanner;
import Samples.*;
import Encapsulation.*;

public class Program {
    public static final double PI = 3.1416; //Declaring a constant 
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Pupil pupil =  new Pupil();
        pupil.setAge(read.nextInt());
        if(pupil.getAge() > 6){
            System.out.println("Welcome");
        }else{
            System.out.println("Sorry");
        }
    }
}