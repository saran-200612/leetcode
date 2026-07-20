class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String g: words){
            if(s.startsWith(g)) count++;
        }
        return count;
    }
}
