import java.util.Scanner;

class ClassRectangle {
    double width, height;
    public ClassRectangle(){

    }
    public ClassRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width : ");
        double width = sc.nextDouble();
        System.out.println("Enter height : ");
        double height = sc.nextDouble();
        ClassRectangle rectangle = new ClassRectangle(width, height);
        System.out.println("Area of rectangle is " + rectangle.area());
        System.out.println("Perimeter of rectangle is " + rectangle.perimeter());
        System.out.println("Rectangle is " + rectangle.display());


    }
}