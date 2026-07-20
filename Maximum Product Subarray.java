class Solution {
    public int maxProduct(int[] nums) {
        int result=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int max=1;
            for(int j=i;j<nums.length;j++){
                max*=nums[j];
                 result=Math.max(max,result);
            }
           
        }
        return result;
    }
}
