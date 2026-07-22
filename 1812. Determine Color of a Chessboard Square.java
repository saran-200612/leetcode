class Solution {
    public boolean squareIsWhite(String coordinates) {
           char ch=coordinates.charAt(0);
           char c=coordinates.charAt(1);
           int temp=c-'0';
            if(ch=='a'||ch=='c'||ch=='e'||ch=='g'){
                
               if(temp%2==0) return true;
            }
            else {
                if(temp%2!=0) return true;
            
        }
        return false;
    }
}
