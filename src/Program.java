import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        enum Rank{
            SOLDIER,
            SERGEANT,
            CAPTAIN
        }



        Rank a = Rank.SOLDIER;

        switch(a){
            case SOLDIER:
                System.out.println("Soldier says, hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says, hi!");
                break;
            case CAPTAIN:
                System.out.println("Captain says, hi!");
                break;
        }
    }
}

enum Difficulty{
    EASY,
    MEDIUM,
    HARD
}