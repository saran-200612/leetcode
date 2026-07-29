class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=1,sum=0;i<=s.length();i++){
        sum+=s.charAt(i-1)-'0';
        if(i%k==0||i==s.length()){
            ans.append(sum);
            sum=0;
        }
        }
        return digitSum(ans.toString(),k);
    }
}
