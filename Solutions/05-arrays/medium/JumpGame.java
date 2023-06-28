//https://leetcode.com/problems/jump-game/
class Solution {
    int t[];
    public boolean canJump(int[] nums) {
        t=new int[nums.length];
        return canReach(nums,0);
    }
    public boolean canReach(int[] nums,int current){
        if(current==nums.length-1){
            return true;
        }
        if(current>=nums.length){
            return false;
        }
        if(t[current]==1){
            return false;
        }
        if(nums[current]==0){
            return false;
        }
        for(int i=nums[current];i>0;i--){
            if(canReach(nums,current+i)){
                return true;
            }
        }  
        t[current]=1;
            
        return false;
    }
}
//Solution by NeetCode
class Solution2 {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for(int i=nums.length-1;i>-1;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }
        return goal==0;
    }
 
}