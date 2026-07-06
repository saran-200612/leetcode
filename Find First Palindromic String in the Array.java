class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String h=words[i];
            StringBuilder ans= new StringBuilder(h);
            ans.reverse();
            if(h.equals(ans.toString())){
                return h;
            }
         
        }
        String k="";
        return k;
    }
}
