class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int product=0;
        for(int i: nums){
            sum+=i;
           int temp=i;
           while(temp>0){
            int d=temp%10;
            product+=d;
            temp/=10;
           }
        }
        int result=sum-product;
        return result;
    }
}
