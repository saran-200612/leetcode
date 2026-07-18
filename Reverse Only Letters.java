class Solution {
    public String reverseOnlyLetters(String s) {
       char arr[]=s.toCharArray();
      int left=0;
      int right=s.length()-1;
      while(left<right){
       char t=arr[left];
       char m=arr[right];
       if(Character.isLetter(t)&&Character.isLetter(m)){
        char temp=arr[left];
       arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
       }
       else if(!Character.isLetter(t)) left++;
       else if(!Character.isLetter(m)) right--;
    }
    StringBuilder ans=new StringBuilder();
    for(char c: arr) ans.append(c);
    return ans.toString();
}
}
