class Solution {
    public int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int s:nums){
            if(s==max1||s==max2||s==max3){
                continue;
            }
            if(s>max1){
                max3=max2;
                max2=max1;
                max1=s;
            }
            else if(s>max2){
                max3=max2;
                max2=s;
            }
            else if(s>max3){
                max3=s;
            }
        }
        return (max3==Long.MIN_VALUE)?(int)max1:(int)max3;
    }
}
