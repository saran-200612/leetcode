class Solution {
    public int smallestEqual(int[] nums) {
        int min=200;
      for(int i=0;i<nums.length;i++){
        if(i%10==nums[i]){
           min=Math.min(i,min);
        }
      }  
      if(min==200) return -1;
      else return min;
    }
}
