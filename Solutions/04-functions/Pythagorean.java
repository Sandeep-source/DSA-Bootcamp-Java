import java.util.Scanner;

public class Pythagorean{
    public static boolean isPy(int a,int b,int c){
        return Math.pow(a,2)+Math.pow(b,2)==Math.pow(c, 2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter value of b: ");
        int b=sc.nextInt();
        System.out.print("Enter value of c: ");
        int c=sc.nextInt();
        System.out.println("Number is Pythagorean: "+isPy(a, b, c));
    }
}