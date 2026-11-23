class Solution {
    public int[] countOppositeParity(int[] nums) {
        int odd=0;
        int even=0;
        int totalodd=0;
        int totaleve=0;
        for(int c:nums){
            if(c%2==0){
                even++;
            }
            else odd++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=odd-totalodd;
                totaleve++;
            }
            else{
                nums[i]=even-totaleve;
                totalodd++;
            }
        }
        return nums;
    }
}
