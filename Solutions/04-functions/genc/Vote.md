```java
public class Vote {
    public static void isEligible(int age){
        System.out.println("The person is "+(age>=18?"Eligible":"Not Eligible"));
    }
    public static void main(String[] args) {
        isEligible(17);
    }
}

```