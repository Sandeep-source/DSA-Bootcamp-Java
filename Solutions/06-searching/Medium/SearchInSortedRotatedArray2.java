class Solution {
    //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
    public boolean search(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[s]==arr[mid]){
                   s++;
            }else if(arr[s]<arr[mid]){
                if(target>=arr[s]&&arr[mid]>target){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if(target<=arr[e]&&target>arr[mid]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
        }
        return false;
    }
}