class Solution {
    public int maxDistance(int[] colors) {
        int left = 0;
        int right = colors.length - 1;
        int tem = 0, j = 0;
        while (left != right) {
            if (colors[left] != colors[right]) {
                tem = Math.abs(right - left);
                break;
            } else
                right--;
        }
        int l = 0;
        int r = colors.length - 1;
        while (l != r) {
            if (colors[l] != colors[r]) {
                j = Math.abs(r - l);
                break;
            } else
                l++;
        }

        return Math.max(tem, j);
    }
}
