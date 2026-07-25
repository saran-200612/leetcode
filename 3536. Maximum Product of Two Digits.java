class Solution {
    public int maxProduct(int n) {
      int max=0;
      int maxx=0;
      while(n>0){
        int digi=n%10;
        if(digi>max){
            maxx=max;
            max=digi;
        }
        else if(digi>maxx){
            maxx=digi;
        }
        n/=10;
      }


        
        return max*maxx;
    }
}
