class Solution {
    //https://leetcode.com/problems/valid-perfect-square/submissions/
    public boolean isPerfectSquare(int num) {
       int s=1;
       int e=num/2+1;
       while(s<=e){
           long mid=s+(e-s)/2;
           long mm=mid*mid;
           if(mm==num){
               return true;
           }
           if(mm>num){
               e=(int)mid-1;
           }else{
               s=(int)mid+1;
           }
       }
       return false;
    }
}