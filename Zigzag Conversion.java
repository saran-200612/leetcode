class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==1|| numRows==1){
            return s;
        }
        String arr[]=new String[numRows];
        int a=0;
        boolean gh=false;
        for(int i=0;i<numRows;i++){
            arr[i]="";
        }
        for( char c:s.toCharArray()){
            arr[a]+=c;
            if(a==00||a==numRows-1){
                gh=!gh;
            }
            a+=gh?1:-1;
        }
        String l="";
        for(String h: arr){
            l+=h;
        }
    return l;
    }
}
