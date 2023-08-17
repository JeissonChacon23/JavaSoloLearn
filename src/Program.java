public class Program {
    public static final double PI = 3.1416; //Declaring a constant 
    public static void main(String[] args){
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();
        
        monopoly.play();
        chess.play();
        battleships.play();
    }
}