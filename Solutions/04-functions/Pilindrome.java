import java.util.Scanner;

public class Pilindrome {
    public static boolean isPilindrome(int num){
     int rev=0;
     int temp=num;
     while(temp>0){
        int rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
     }
     return rev==num;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check for pilindrome: ");
        int num=new Scanner(System.in).nextInt();
        System.out.println("The number "+num+" "+(isPilindrome(num)?"is pilindrome":" is not pilindrome"));
    }
}
