class Solution {
    public boolean isSameAfterReversals(int num) {
       int j=isReverse(num);
       int k=isReverse(j);
       if(num==k){
        return true;
       }
       else{
        return false;
       }
    }
        public static int isReverse(int z){
            int n=0;
             while(z>0){
            int digi=z%10;
            n=n*10+digi;
            z=z/10;
        }
        return n;
        }
    }
