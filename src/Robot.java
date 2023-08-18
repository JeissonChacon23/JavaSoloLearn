public class Robot {
        int id;

        Robot(int id){
            this.id = id;
            Brain b = new Brain();
            b.think();
        }
    private class Brain{
        public void think(){
            System.out.println(id +" is thinking");
        }
    }
    
}