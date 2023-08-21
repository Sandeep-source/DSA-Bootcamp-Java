class Solution {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public int[] searchRange(int[] arr, int target) {
        int[] ans={-1,-1};
        if(arr==null) return ans;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans[0]=mid;
                e=mid-1;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        s=0;
        e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans[1]=mid;
                s=mid+1;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }

        }
        return ans;
    }
}