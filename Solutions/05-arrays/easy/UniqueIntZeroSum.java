class Solution {
    //https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        for(int i=0;i<n/2;i++){
            ans[i]=-(i+1);
            ans[n-1-i]=(i+1);
        }
        if((n&2)==1){
            ans[n/2]=0;
        }
        return ans;
    }
}