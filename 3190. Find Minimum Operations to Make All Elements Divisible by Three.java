class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int g:nums){
            if(g%3!=0) ans++;
        }
        return ans;
    }
}
