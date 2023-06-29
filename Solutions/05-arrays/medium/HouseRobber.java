class Solution {
    //https://leetcode.com/problems/house-robber/
    public int rob(int[] nums) {
       int[] mem=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           mem[i]=-1;
       }
       return getMax(0,nums,mem);
    }
    public int getMax(int current,int[] nums,int[] mem){
        if(current>=nums.length)
        return 0;
        int max=0;
        for(int i=current;i<nums.length;i++){
            int temp=0;
            if(mem[i]>-1){
                temp=mem[i];
            }else{
             temp=nums[i]+getMax(i+2,nums,mem);
            }
            if(max<temp)
            max=temp;
            

        }
        mem[current]=max;
        return max;
    }
}