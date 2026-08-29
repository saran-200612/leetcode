class Solution {
    public int countEven(int num) {
        int count = 0;
        int temp = 1;
        while (temp <= num) {
            int n = temp;

            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }
            if (sum % 2 == 0) {
                count++;

            }
            temp++;
        }
        return count;
    }
}
