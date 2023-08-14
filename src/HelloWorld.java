import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //Looping over arrays
        Scanner sc = new Scanner(System.in);
        int[] ages = {18, 33, 24, 64, 45};
        System.out.println(ages.length);

        for(int x=0; x<ages.length; x++) {
            System.out.println(ages[x]);
        }

        int sum = 0;
        for(int x=0;x<ages.length;x++) {
            sum += ages[x];
        }
        System.out.println(sum);

        System.out.println("\n\nFor Each");
        //For each 
        for(int i : ages){
            System.out.println(i);
        }
        System.out.println("\n\n");
        sum = 0;
        for(int x: ages) {
        sum += x;
        }
        System.out.println(sum);
        int[ ] nums = {3, 8, 5, 2};

        int res = 0;
        for(int x: nums) {
        if(x > res) {
            res = x;
        }
        }
        System.out.println(res);

        //Quiz
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        sum = 0;
        for(int i = 0; i < revenue.length; i++){
            sum += revenue[i];
        }
        double average = sum / revenue.length;
        System.out.println(average);
    }
}
