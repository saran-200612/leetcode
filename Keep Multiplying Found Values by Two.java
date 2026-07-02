class Solution {
    public int findFinalValue(int[] nums, int original) {
       List<Integer>list=new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        int result=0;
       while(list.contains(original)){
          original=2*original;
        }
        return original;
    }
}
