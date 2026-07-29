class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int ans=-1;
        for(int num:nums){
            
            set.add(num);
            int k=num*(-1);
            if(set.contains(k)){
                ans=Math.max(ans,Math.abs(num));
            }
        }
        return ans;
    }
}
