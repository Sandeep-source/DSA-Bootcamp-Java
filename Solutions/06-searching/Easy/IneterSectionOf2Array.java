class Solution {
    //https://leetcode.com/problems/intersection-of-two-arrays/
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list=new HashSet<>();
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            map.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.contains(nums1[i])){
                list.add(nums1[i]);
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(Integer ele : list){
            ans[i++]=ele;
        }
        return ans;
    }
}