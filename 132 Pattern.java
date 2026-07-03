class Solution {
    public boolean find132pattern(int[] nums) {
        int[] arr = new int[nums.length];
        int top = -1;
        int second = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < second)
                return true;
            while (top >= 0 && arr[top] < nums[i])
                second = arr[top--];
            arr[++top] = nums[i];
        }
        return false;
    }
}
