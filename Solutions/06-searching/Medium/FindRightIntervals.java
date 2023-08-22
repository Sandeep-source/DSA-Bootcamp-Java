class Solution {
    //https://leetcode.com/problems/find-right-interval/description/
    public int[] findRightInterval(int[][] intervals) {
        int[] ans=new int[intervals.length];
        HashMap<Integer,Integer> index=new HashMap<>();
        for(int i=0;i<intervals.length;i++){
            index.put(intervals[i][0],i);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0;i<intervals.length;i++){
            int s=0;
            int e=intervals.length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(intervals[mid][0]>=intervals[i][1]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            if(s!=-1&&s<intervals.length)
            ans[index.get(intervals[i][0])]=index.get(intervals[s][0]);
            else
            ans[index.get(intervals[i][0])]=-1;
        }
        return ans;
    }
}