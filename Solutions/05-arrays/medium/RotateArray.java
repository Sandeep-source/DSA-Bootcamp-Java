class Solution {
    //https://leetcode.com/problems/rotate-array/
    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[(i+k)%nums.length]=temp[i];
        }
    }
}