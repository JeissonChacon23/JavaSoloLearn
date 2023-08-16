import java.util.Scanner;
/*
        public: The class is accessible by any other class.
        default: The class is accessible only by classes in the same package.
        The following choices are available for attributes and methods:
        default: A variable or method declared with no access control modifier is available to any other class in the same package.
        public: Accessible from any other class.
        protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass (Subclasses and superclasses are covered in upcoming lessons).
        private: Accessible only within the declared class itself.
         */
public class Program {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        Country c = new Country();
	    c.name = "France";
	    c.capital = "Paris";
	    System.out.println("Country:  " + c.name);
	    System.out.println("Capital:  " + c.capital);
    }
}
