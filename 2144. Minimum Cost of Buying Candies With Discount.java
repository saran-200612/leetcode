class Solution {
    public int minimumCost(int[] cost) {
      Arrays.sort(cost);
      int tot=0;
      int len=cost.length;
      for(int i=0;i<cost.length;i+=3){
        tot+=cost[len-1-i];
        if(i+1<len){
            tot+=cost[len-1-(i+1)];
        }
      }  
      return tot;
    }
}
