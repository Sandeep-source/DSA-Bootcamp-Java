package easy;
import java.util.Arrays;

class Solution {
    //https://leetcode.com/problems/create-target-array-in-the-given-order
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            for(int j=i;j>index[i];j--){
                ans[j]=ans[j-1];
            }
            ans[index[i]]=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr,index)));
    }
}
