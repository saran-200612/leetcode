class Solution {
    public boolean predictTheWinner(int[] nums) {
        return maxDiff(nums,0,nums.length-1)>=0;
    }
    private int maxDiff(int[]nums,int left,int right){
        if(left==right){
            return nums[left];
        }
        int takeLeft=nums[left]-maxDiff(nums,left+1,right) ;
        int takeRight=nums[right]-maxDiff(nums,left,right-1);
         return Math.max(takeLeft,takeRight);
           }
}
