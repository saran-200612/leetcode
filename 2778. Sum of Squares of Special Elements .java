class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                list.add(nums[i]);
            }

        }
        int k=0;
        for(int i:list){
            k+=i*i;
        }
        return k;
    }
}
