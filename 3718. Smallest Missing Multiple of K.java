class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>seen=new HashSet<>();
        for(int i:nums){
            seen.add(i);
        }
              int v=k;
              while(seen.contains(v)){
                v+=k;
              }
              return v;
    }
}
