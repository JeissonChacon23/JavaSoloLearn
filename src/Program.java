import Polymorphism.*;

public class Program {
    public static final double PI = 3.1416; //Declaring a constant 
    public static void main(String[] args){
        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSound();
        b.makeSound();
    }
}