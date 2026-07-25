class Solution {
    public int maxProduct(int[] nums) {
        int flarg=0;
        int slarg=0;
       for(int i=0;i<nums.length;i++){
         if(nums[i]>flarg){
            slarg=flarg;
            flarg=nums[i];
         }
         else if(nums[i]>slarg){
            slarg=nums[i];
         }
       } 
       return (slarg-1)*(flarg-1);
    }
}
