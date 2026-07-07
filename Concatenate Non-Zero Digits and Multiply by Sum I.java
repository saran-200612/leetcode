class Solution {
    public long sumAndMultiply(int n) {
        String s =Integer.toString(n);
        int sum=0;
       StringBuilder ans=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char cg=s.charAt(i);
        if(cg!='0')
        ans.append(cg);
        sum+=(cg-'0');
      }
        if(ans.length()==0) return 0;
        long bgh=Long.parseLong(ans.toString());
        return bgh*sum;
    }
}
