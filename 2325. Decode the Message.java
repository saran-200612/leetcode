class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map=new HashMap<>();
        char cr='a';
        for(char c:key.toCharArray()){
            if(c!=' '&&!map.containsKey(c)){
                map.put(c,cr++);
                }
            }
            StringBuilder decode=new StringBuilder();
            for(char c:message.toCharArray()){
                if(c==' '){
                    decode.append(' ');
                }
                else{
                    decode.append(map.get(c));
                }
            }
            return decode.toString();
        }
    
}
