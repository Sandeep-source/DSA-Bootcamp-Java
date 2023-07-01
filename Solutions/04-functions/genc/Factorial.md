```java
import java.util.Scanner;
public class Factorial {
    public static void main(int num){
        int fact=1;
        for(int i=2;i<=num;i++)
          fact*=i;
        System.out.println("Factorial of "+num+" is: "+fact);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate factorial: ");
        int num=new Scanner(System.in).nextInt();
        main(num);
    }
}

```