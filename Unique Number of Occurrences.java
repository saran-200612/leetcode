class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(!list.contains(map.get(i))){
                list.add(map.get(i));
            }
        }
        if(map.size()==list.size()) return true;
    return false;
    }
}
