class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].matches("\\d+")){
                int n=Integer.parseInt(strs[i]);
            max=Math.max(n,max);
            }
            else{
            String y=strs[i];
            int g=y.length();
            max=Math.max(g,max);
        }}
        return max;
    }
}
