public class Vehicle {
    private String color;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    Vehicle(){ //This is a constructor
        this.setColor("Blue");
    }
    Vehicle(String color){
        this.setColor(color);
    }
}