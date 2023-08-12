import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //While
        int x = 3;
        while(x > 0){
            System.out.println(x + "\n");
            x--;
        }

        //Do while
        int y = 1;
        do{
            System.out.println(y);
            y++;
        }while(y < 5);
    }
}
