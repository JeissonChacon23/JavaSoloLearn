public class Program {
        public static void main(String[] args){
            Thread t = new Thread(new Loader());
            t.start();

            Welcome welcome = new Welcome();
            welcome.setPriority(10);
            Name name = new Name();
            name.setPriority(9);
            
            name.start();
            welcome.start();

            Thread obj = new Thread(new A());
            obj.start();
    }
}