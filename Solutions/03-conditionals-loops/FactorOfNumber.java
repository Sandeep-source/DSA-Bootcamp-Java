import java.util.Scanner;
public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        double a=sc.nextDouble();
        System.out.println("Factors of number "+a+": ");
        for(int i=1;i<=a;i++){
            if(a%i==0)
            System.out.println(i);
        }
    }
}
