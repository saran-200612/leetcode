class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;int idxmn=0;int idxmx=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[idxmx]) idxmx=i;
            if(nums[i]>nums[idxmn]) idxmn=i;
        }
        int m=Math.max(idxmx,idxmn)+1;
        int b=n-Math.min(idxmx,idxmn);
        int v=idxmx+1+n-idxmn;
        int f= idxmn+1+n-idxmx;
        return Math.min(Math.min(m,b),Math.min(v,f));

    }
}
