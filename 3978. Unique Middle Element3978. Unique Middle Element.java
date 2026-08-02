class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
       int n=nums[nums.length/2];
       int count =0;
       for(int i:nums){
        if(i==n) count++;
       } 
       if(count>1) return false;
    return true;
    }
}
