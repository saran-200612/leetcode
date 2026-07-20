class Solution {
    public boolean isPrefixString(String s, String[] words) {
   StringBuilder abs=new StringBuilder();
   for(int i=0;i<words.length;i++){
    abs.append(words[i]);
    
    if(s.equals(abs.toString())) return true;
   }
return false;
    }
}
