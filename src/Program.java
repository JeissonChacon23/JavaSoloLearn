import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int x = 5;
        addOneTo(x);

        square(x);
        System.out.println(x); 

        Person j;
        j = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());

        Person p = new Person();
        p.setAge(25);
        change(p);
        System.out.println(p.getAge());
    }

    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
    static void addOneTo(int num){
        num++;
    }
    static void square(int x) {
        x = x*x;
    }
    static void change(Person p){
        p.setAge(10);
    }
}