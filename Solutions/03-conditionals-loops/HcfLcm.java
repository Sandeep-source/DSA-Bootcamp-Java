import java.util.Scanner;
public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double hcf=0d;
        double lcm=0d;
        int tem=a>b?a:b;
        for(int i=tem;i<=a*b;i=i+tem){
            if(i%a==0&&i%b==0){
                lcm=i;
                break;
            }
        }
        tem=a>b?b:a;
        for(int i=tem;i>=1;i--){
            if(a%i==0&&b%i==0){
                hcf=i;
                break;
            }
        }

        System.out.println("LCM : "+lcm);
        System.out.println("HCF : "+hcf);
    }
}
