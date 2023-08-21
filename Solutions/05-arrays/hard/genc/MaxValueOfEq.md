```java
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int[]  val=new int[points.length];
        for(int i=0;i<points.length;i++){
            val[i]=Integer.MIN_VALUE;
        }
        return getMax(0,points,k,val);
    }
    public int getMax(int current,int[][] points,int k,int[] val){
        if(current>=points.length){
            return Integer.MIN_VALUE;
        }
        int max=Integer.MIN_VALUE;
        if(val[current]>Integer.MIN_VALUE){
            return val[current];
        }
        for(int i=current+1;i<points.length;i++){
              int value=Math.abs(points[current][0]-points[i][0]);
              if(value<=k){
                  int temp=points[current][1]+points[i][1]+value;
                  if(temp>max){
                      max=temp;
                  }
              }else{
                  break;
              }
              
        }
        val[current]=max;
        int temp=getMax(current+1,points,k,val);
        if(temp>max){
            max=temp;
        }
        return max;
    }
}

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
              int value=Math.abs(points[i][0]-points[j][0]);
              if(value<=k){
                  int temp=points[i][1]+points[j][1]+value;
                  if(temp>max){
                      max=temp;
                  }
              }else{
                  break;
              }
            }
        }
        return max;
    }

   
}
```