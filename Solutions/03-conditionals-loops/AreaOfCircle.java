import java.util.Scanner;

public class AreaOfCircle{
    public static double area(double radius){
       return Math.PI*radius*radius;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double rad=sc.nextDouble();
        System.out.println("Area of circle with radius "+rad+" : "+area(rad));
    }
}