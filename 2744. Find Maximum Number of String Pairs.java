class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        List<String> li = new ArrayList<>();
        for (String s : words) {
            li.add(s);

        }
        int count = 0;
        for (int i = 0; i < li.size(); i++) {

            StringBuilder ans = new StringBuilder(li.get(i));
            String reversed = ans.reverse().toString();
            for (int j = i + 1; j < li.size(); j++) {
                if ((li.get(j)).equals(reversed)) {
                    count++;
                    li.remove(j);
                    li.remove(i);
                    i--;
                    break;
                }
            }
        }
        return count;
    }
}
