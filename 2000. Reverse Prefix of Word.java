class Solution {
    public String reversePrefix(String word, char ch) {
        int s=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){ s=i; break;}
        }
        if(s==0) return word;
        StringBuilder ans=new StringBuilder();
        for(int i=s;i>=0;i--){
            ans.append(word.charAt(i));
        }
        for(int i=s+1;i<word.length();i++) ans.append(word.charAt(i));
        return ans.toString();
    }
}
