import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //For
        for (int i = 2; i < 10; i = i*i) {
            System.out.println(i);
          }

        int x = 1;

        while(x < 10) {
              System.out.println(x);
              if(x == 4) {
                  break;
              }
              x++;
        }

        for(int a=10; a<=40; a+=10) {
            if(a == 30) {
                continue;
            }
            System.out.println(a);
        }
    }
}
