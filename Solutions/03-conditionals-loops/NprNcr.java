import java.util.Scanner;
public class NprNcr {
    public static double fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        double nPr=fact(n)/fact(n-r);
        double nCr=fact(n)/(fact(n-r)*fact(r));
        System.out.println("nPr : "+nPr);
        System.out.println("nCr : "+nCr);
    }
}
