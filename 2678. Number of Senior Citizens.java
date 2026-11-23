class Solution {
    public int countSeniors(String[] details) {
        List<Integer> li = new ArrayList<>();
        for (String s : details) {
            StringBuilder ans = new StringBuilder();

            for (int i = 11; i < 13; i++) {

                ans.append(s.charAt(i));
            }
            int dig = Integer.parseInt(ans.toString());
            li.add(dig);
        }
        int cout = 0;
        for (int x : li) {
            if (x > 60) {
                cout++;
            }
        }
        return cout;
    }
}
