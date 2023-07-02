```java
import java.util.Scanner;

public class PrimeBW2Num {
    public static boolean isPrime(int num){
        for(int i=2;i<num/2+1;i++){
            if(num%i==0)
            return false;
        }
        return true;
    }
    public static void primeN(int a,int b){
        System.out.print("Prime Numbers between "+a+" and "+b+" are : ");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("Enter First Num : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter Second Num : ");
        int b=sc.nextInt();
        primeN(a, b);
    }
}

```