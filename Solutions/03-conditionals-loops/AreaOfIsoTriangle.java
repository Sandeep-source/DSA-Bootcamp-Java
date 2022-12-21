

import java.util.Scanner;

public class AreaOfIsoTriangle{
    public static double area(double h,double w){
       return (h*w)/2;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Height : ");
        double h=sc.nextDouble();
        System.out.print("Enter base : ");
        double w=sc.nextDouble();
        System.out.println("Area of Isosceles Triangle with heigth "+h+" and base "+w+" : "+area(h,w));
    }
}


