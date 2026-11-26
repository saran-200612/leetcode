class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums[0];
        int m = nums[nums.length - 1];
        for (int i = n; i <= m; i++) {
            list.add(i);
        }
        for (int j : nums) {

            list.remove(Integer.valueOf(j));

        }
        return list;
    }
}
