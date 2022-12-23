import java.util.Scanner;

public class AreaOfParallelogram{
    public static double area(double b,double h){
       return b*h;
    } 
    public static void main(String[] args) {
        /*
         *                 _________b___________
         *                /|                   /
         *             a / |h                 /
         *              /  |                 /
         *             /___|______b_________/ 
         *        
         */
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base : ");
        double a=sc.nextDouble();
        System.out.print("Enter height : ");
        double h=sc.nextDouble();
        System.out.println("Area of parallelogram with base "+a+" and height "+h+" : "+area(a,h));
    }
}