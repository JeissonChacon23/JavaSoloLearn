import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) throws Exception {
        //Multidimensional arrays 
        int[][] sample = {
            {1, 2, 3},
            {4, 5, 6}
            };
            for(int x=0; x<sample.length; x++) {
                for(int y=0; y<sample[x].length; y++) {
                    System.out.println(sample[x][y]);
                }
            } 

        int[][] grid = {{8, 4}, {2, 5}, {9, 6}};
        System.out.println(grid[2][1]);

        int[][] seats = {
            {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
            {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
            };
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int column = sc.nextInt();
            if(seats[row][column] == 0){
                System.out.println("Free");
            }else{
                System.out.println("Sold");
            }
    }
}
