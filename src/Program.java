import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        Vehicle v1 = new Vehicle();
        v1.setColor("Red");
        System.out.println(v1.getColor());

        //Test
        Student s = new Student();
        s.setAge(read.nextInt());
        String name = "Jeisson";
        s.name = name;
        System.out.println(s.name);
        System.out.println(s.getAge());
    }
}