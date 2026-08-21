class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int h=A.length;
        int fre[]=new int[h+1];
        int[] ans=new int[h];
        int match=0;
        for(int i=0;i<h;i++){
            if(++fre[A[i]]==2) match++;
            if(++fre[B[i]]==2) match++;
            ans[i]=match;
        }
        return ans;
    }
}
