public class Purchase {
    int price;
    public int totalAmount(int price){
        return price - (int)(price * 0.10);
    }
}
