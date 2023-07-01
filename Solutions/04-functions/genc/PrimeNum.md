```java
import java.util.Scanner;
public class PrimeNum {
    public static boolean isPrime(int num){
        for(int i=2;i<num/2+1;i++){
            if(num%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check for Prime: ");
        int num=new Scanner(System.in).nextInt();
        System.out.println("The number "+num+(isPrime(num)?" is prime.":" is not prime."));
    }
}

```