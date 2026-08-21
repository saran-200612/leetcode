import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list=new ArrayList<>();
        for(String h:words){
          String arr[]=h.split(Pattern.quote(String.valueOf(separator)));
          for(String s:arr){
            if(!s.isEmpty()){
                list.add(s);
            }
          }
        }
        return list;
    }
}
