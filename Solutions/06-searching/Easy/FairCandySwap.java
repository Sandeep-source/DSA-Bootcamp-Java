class Solution {
    //https://leetcode.com/problems/fair-candy-swap/
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice=0;
        int bob=0;
        HashMap<Integer,Integer> bmap=new HashMap<>();
        for(int i=0;i<aliceSizes.length;i++){
            alice+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            bob+=bobSizes[i];
            bmap.put(bobSizes[i],1);
        }
        int[] ans={0,0};
        for(int i=0;i<aliceSizes.length;i++){
            int a=alice-aliceSizes[i];
            int b=bob+aliceSizes[i];
            int diff=Math.abs(a-b);
            ans[0]=aliceSizes[i];
            ans[1]=diff/2;
            if(a+ans[1]==b-ans[1]&&bmap.containsKey(ans[1])){
                break;
            }
        }
        return ans;

    }
}