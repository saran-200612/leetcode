class Solution {
    public int maxProductDifference(int[] nums) {
      Arrays.sort(nums);
      int s=nums[0]*nums[1];
      int c=nums[nums.length-1]*nums[nums.length-2];
      return c-s;
    }
}
