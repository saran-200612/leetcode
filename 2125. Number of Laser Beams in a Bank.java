class Solution {
    public int numberOfBeams(String[] bank) {
        int red = 0;
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < bank.length; i++) {
            int icount = 0;
            String str = "";
            str = bank[i];

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1')
                    icount++;
            }
            if (icount == 0)
                continue;
            l1.add(icount);
        }
        for (int i = 0; i < l1.size() - 1; i++) {
            red = red + (l1.get(i) * l1.get(i + 1));
        }
        return red;
    }
}
