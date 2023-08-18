import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Machine m = new Machine(){
        @Override public void start(){
            System.out.println("Woooooo");
        }
        };
        m.start();

        Machine n = new Machine(){
            @Override public void start(){
                System.out.println("Hi!");
            }
        };

        n.start();
        Machine x = new Machine();
        x.start();


        Purchase customer = new Purchase();
        Purchase specialCustomer = new Purchase(){
            public int totalAmount(int price){
                return price - (int)(price * 0.20);
            }
        };
        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));

        A obect1 = new A();
        obect1.print();
        A object = new A(){
            @Override public void print(){
                System.out.println("Hello");
            }
        };
        object.print();
    }
}