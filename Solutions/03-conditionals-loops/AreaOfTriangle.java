
import java.util.Scanner;

public class AreaOfTriangle{
    public static double area(double h,double w){
       return (1.0/2.0)*h*w;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Height : ");
        double h=sc.nextDouble();
        System.out.print("Enter Base : ");
        double b=sc.nextDouble();
        System.out.println("Area of triangle with heigth "+h+" and base "+b+" : "+area(h,b));
    }
}
