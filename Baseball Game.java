class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> st=new Stack<>();
      for(String g: operations){
        if(g.equals("+")){
            int t=st.pop();
            int o=st.peek();
            st.push(t);
            st.push(t+o);
        }
        else if(g.equals("D")){
            st.push(st.peek()*2);
        }
        else if(g.equals("C")){
            st.pop();
        }
        else{
            st.push(Integer.parseInt(g));
        }

      }  
      int s=0;
      while(!st.isEmpty()){
        s+=st.pop();
      }
      return s;
    }
}
