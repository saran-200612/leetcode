class Solution {
    public boolean checkDivisibility(int n) {
        int d=n;
    int sum=0;
    int product =1;
    while(n>0){
        int temp=n%10;
        sum+=temp;
        product*=temp;
        n/=10;
    } 
   int g=sum+product;
    return d%g==0;
    }
}
