```java
class Solution {
    //https://leetcode.com/problems/maximum-population-year/submissions/866425530/
    public int maximumPopulation(int[][] logs) {
        int max=0;
        int[] arr=new int[100];
        for(int j=0;j<logs.length;j++){
           for(int i=logs[j][0];i<logs[j][1];i++){
               arr[i-1950]++;
           }  
  
        }
        int year=0;
        for(int i=0;i<100;i++){
           if(arr[i]>arr[year]){
               year=i;
           }
        }
        return year+1950;

    }
}
```