```java
class Solution {
    //https://leetcode.com/problems/single-element-in-a-sorted-array/
    public int singleNonDuplicate(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if((mid+1==nums.length || nums[mid]!=nums[mid+1]) && (mid-1<0 || nums[mid-1]!=nums[mid])){
                return nums[mid];
            }
            int leftSize=nums[mid]==nums[mid-1]?mid-1:mid;
            if(leftSize%2==0){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}
```