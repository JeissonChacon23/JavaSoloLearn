import java.util.Scanner;

class main {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Animal dog = new Animal();
        dog.bark();
        LoadingMessage load = new LoadingMessage();
        load.LoadingMessage();

        //Creating objects
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.color = "red";
        v2.horn();
        System.out.println(v1.color);

        //Quiz
        Costumer costumer = new Costumer();
        costumer.firstName = read.nextLine();
        costumer.secondName = read.nextLine();
        costumer.age = read.nextInt();
        costumer.roomNumber = read.nextInt();
        costumer.saveCostumerInfo();

        /*
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();

        Customer customer = new Customer();
        //set customer's data to object here
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;
        customer.saveCustomerInfo();
         */
    }
}
