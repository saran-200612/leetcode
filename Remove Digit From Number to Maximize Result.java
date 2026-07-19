class Solution {
    public String removeDigit(String number, char digit) {
       char arr[]=number.toCharArray();
       String hk="";
      
       for(int i=0;i<arr.length;i++){
        if(arr[i]==digit){
            String ans="";
            for(int j=0;j<arr.length;j++){
          if(i==j){  continue;}
        else{
          ans+=arr[j];
        }
            }
            if(hk.equals("")||ans.compareTo(hk)>0){
                hk=ans;
            }
        }
        
       } 
       return hk;
    }
}
