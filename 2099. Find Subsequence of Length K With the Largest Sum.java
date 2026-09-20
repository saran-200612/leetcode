class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Integer arr[] = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int ar[] = new int[k];
        for (int i = 0; i < k; i++) {
            ar[i] = arr[i];
        }
        int ans[] = new int[k];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < k; j++) {
                if (nums[i] == ar[j]) {
                    ans[index++] = nums[i];
                    ar[j] = Integer.MIN_VALUE;
                    break;
                }
            }
            if (index == k) {
                break;
            }
        }
        return ans;
    }
}
