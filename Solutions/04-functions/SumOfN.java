import java.util.Scanner;
public class SumOfN{
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of first N natural numbers is: "+((n*(n+1))/2));
    }
}
