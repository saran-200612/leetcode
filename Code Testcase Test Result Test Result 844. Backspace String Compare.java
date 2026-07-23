class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stacp = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                stack.push(ch);
            } else if (!stack.isEmpty())
                stack.pop();
        }
        for (char ch : t.toCharArray()) {
            if (Character.isLetter(ch)) {
                stacp.push(ch);
            } else {
                if (!stacp.isEmpty())
                    stacp.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        StringBuilder ams = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        ans.reverse();
        while (!stacp.isEmpty()) {
            ams.append(stacp.pop());
        }
        ams.reverse();
        return ans.toString().equals(ams.toString());

    }
}
