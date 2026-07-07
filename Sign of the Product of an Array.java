class Solution {
    public int arraySign(int[] nums) {
        int j=1;
        for(int i:nums){
           { if(i==0) return 0;}
           {if(i<0)  j=-j;}
        }
     return j;
    }
}
