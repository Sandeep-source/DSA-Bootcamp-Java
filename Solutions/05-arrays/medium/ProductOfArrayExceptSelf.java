class Solution {
    //https://leetcode.com/problems/product-of-array-except-self/
    public int[] productExceptSelf(int[] nums) {
        int pre=1;
        int[] ans=new int[nums.length];
        ans[0]=1;
        for(int i=0;i<nums.length-1;i++){
            pre*=nums[i];
            ans[i+1]=pre;
        }
        pre=1;
        for(int i=nums.length-1;i>0;i--){
           pre*=nums[i];
           ans[i-1]*=pre;
        }
        return ans;

    }
}