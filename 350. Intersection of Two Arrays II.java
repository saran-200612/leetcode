class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : nums1)
            list1.add(i);
        for (int i : nums2)
            list2.add(i);
        List<Integer> res = new ArrayList<>();
        int min = Math.min(nums1.length, nums2.length);

        for (int i : list1) {
            if (list2.contains(i)) {
                res.add(i);
                list2.remove(Integer.valueOf(i));
            }
        }
        int arr[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}
