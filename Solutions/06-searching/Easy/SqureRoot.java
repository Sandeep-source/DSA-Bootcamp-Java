class Solution {
    //https://leetcode.com/problems/sqrtx/
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            double mm=Math.pow(mid,2);
            if(mm==x){
                return mid;
            }
            if(mm>x){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return e;

    }
}