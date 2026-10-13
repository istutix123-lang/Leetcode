
class Solution {
    public long sumAndMultiply(int n) {
        long temp = 0;
        long sum = 0;

        while (n > 0) {
            int num = n % 10;

            if (num != 0) {
                temp = temp * 10 + num;
                sum += num;
            }

            n = n / 10;
        }

        long temp2 = 0;

        while (temp > 0) {
            long digit = temp % 10;
            temp2 = temp2 * 10 + digit;
            temp = temp / 10;
        }

        return temp2 * sum;
    }
}
