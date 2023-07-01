import java.util.Scanner;
public class RadiusOfCircle {
    public static double circumference(double r){
        return 2*Math.PI*r;
    }
    public static double area(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        System.out.println("Enter radius: ");
        double radius= new Scanner(System.in).nextDouble();
        System.out.println("Circumference of circle with radius "+radius+" is: "+circumference(radius));
        System.out.println("Area of circle with radius "+radius+" is: "+area(radius));
    }
}
