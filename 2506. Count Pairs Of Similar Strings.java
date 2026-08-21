class Solution {
    public int similarPairs(String[] words) {
        int n = words.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> set1 = new HashSet<>();
            for (char ch : words[i].toCharArray()) {
                set1.add(ch);
            }
            for (int h = i + 1; h < n; h++) {
                Set<Character> set2 = new HashSet<>();
                for (char c : words[h].toCharArray()) {
                    set2.add(c);
                }
                if (set2.equals(set1)) {
                    res++;
                }
            }
        }
        return res;
    }

}
