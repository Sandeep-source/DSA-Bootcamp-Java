import java.util.Scanner;
public class AreaOfEquiTri {
    static double area(double side){
       return (Math.sqrt(3)/4)*(side*side);
    }
     public static void main(String[] args) {
        /*
         *              /\
         *            /    \
         *          /________\
         *   All side equal
         */
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter side : ");
        double a=sc.nextDouble();
     
        System.out.println("Area of Equilateral Triangle with side "+a+" : "+area(a));
  
     }
}
