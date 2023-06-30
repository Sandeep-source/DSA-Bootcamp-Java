public class MaxMinOfThreeNum{
    public static void maxMinOfThreeNum(int a, int b,int c){
        int max= (a>b?a:b)>c?(a>b?a:b):c;
        int min= (a<b?a:b)<c?(a<b?a:b):c;
        System.out.println(max+" "+min);
    }
    public static void main(String ... args){
        maxMinOfThreeNum(5,3,6);
    }
}