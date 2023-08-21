class Solution {
    //https://leetcode.com/problems/binary-search/
    public int search(int[] nums, int target) {
       return binSearch(nums,0,nums.length-1,target);
    }
    int binSearch(int[] num,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(num[mid]==target){
            return mid;
        }
        if(num[mid]>target){
            return binSearch(num,s,mid-1,target);
        }else{
            return binSearch(num,mid+1,e,target);
        }
    }
    }