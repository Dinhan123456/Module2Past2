
class Fan {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    int speed;
    boolean on;
    double radius;
    String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        if (on){
            return "The fan is on and is set to speed " + speed + " and has a radius of " + radius + " and color " + color;
        }else{
            return "Fan is off [color=" + color + ", radius=" + radius + "]";
        }
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("red");
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("green");
        System.out.println(fan2);

        System.out.println("fan1: " + fan1.toString());
        System.out.println("fan2: " + fan2.toString());
    }
}
