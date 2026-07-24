class Solution {
    public int countPoints(String rings) {
       int red[]=new int[10];
       int blue[]=new int[10];
       int gree[]=new int [10];
       int count=0;
       for(int i=0;i<rings.length()-1;i+=2){
        int val=rings.charAt(i+1)-'0';
        if(rings.charAt(i)=='R'){
            red[val]++;
        }
        else if(rings.charAt(i)=='B'){
            blue[val]++;
        }
        else{
            gree[val]++;
        }
       }
       for(int i=0;i<10;i++){
        if(red[i]>0&&blue[i]>0&&gree[i]>0){
            count++;
        }
       
       } return count;
    }
}
