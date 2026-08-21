class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            Set<Character> set = new HashSet<>();
            int n = 0;
            for (char c : words[i].toCharArray()) {
                set.add(c);
            }

            for (char c : set) {
                if (allowed.contains(String.valueOf(c))) {
                    n++;
                }
            }
            if (n == set.size()) {
                count++;
            }
        }
        return count;
    }
}
