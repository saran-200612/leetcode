class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String h=s+s;
        String g=h.substring(1,h.length()-1);
        if(g.contains(s)) return true;
        return false;
    }
}
