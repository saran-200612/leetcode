class Solution {
    public long gcdSum(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            nums[i]=gd(nums[i],max);
        }
        Arrays.sort(nums);
        long res=0;
        for(int i=0,j=nums.length-1;i<j;i++,j--) res+=gd(nums[i],nums[j]);
        return res;
    }
    private int gd(int A,int B) { return B==0?A: gd(B,A%B);}
    
}
