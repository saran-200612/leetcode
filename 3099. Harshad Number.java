class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int y = x;
        int digit = 0;
        while (x > 0) {
            digit += x % 10;
            x /= 10;
        }
        if (y % digit == 0)
            return digit;
        return -1;
    }
}
