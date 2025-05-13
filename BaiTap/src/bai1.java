import java.util.Scanner;

class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) return Double.NaN;
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) return Double.NaN;
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

}


public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        System.out.println("Delta: " + delta);
        if (delta > 0){
            System.out.println("The equation has two roots:");
            System.out.println("Root 1 = " + equation.getRoot1());
            System.out.println("Root 2 = " + equation.getRoot2());
        }else if (delta == 0){
            System.out.println("The equation has one root:");
            System.out.println("Root = " + equation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
        sc.close();
    }
}
