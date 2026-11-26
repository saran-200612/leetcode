class Solution {
    public String truncateSentence(String s, int k) {
        String arr[] = s.split(" ");
        String n = "";
        n += arr[0];
        for (int i = 1; i < k; i++) {
            n += " ";
            n += arr[i];

        }
        return n;
    }
}
