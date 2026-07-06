class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        String h=x+"";
        int i=0;
        for(String d:words){
            if(d.contains(h)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}
