class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<nums.length-1;i+=2){
            int temp=nums[i+1];
            int k=0;
            while(k<nums[i]){
                l1.add(temp);
                k++;
            }
        } int l=0;
        int arr[]=new int[l1.size()];
        for(int i:l1) {
           
            arr[l++]=i;
        }
return arr;
    }
}
