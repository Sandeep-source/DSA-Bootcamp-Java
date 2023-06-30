```java
import java.util.Scanner;

public class ProdOf2Num {
     public static int prod(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is: "+prod(a,b));
    }
}

```