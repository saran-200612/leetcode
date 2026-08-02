class Solution {
    public boolean checkGoodInteger(int n) {
       int temp=n;
       int res=0,sqsum=0;
       while(temp>0){
        int digit=temp%10;
        res+=digit;
        sqsum+=digit*digit;
        temp/=10;
       } 
       if(sqsum-res>=50) return true;
       return false;
    }
}
