
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum = 0;
        int osum = 0;
        for (int i = 1; i <= n; i++) {
            esum += 2 * i;
            osum += 2 * i - 1;
        }
        int min = Math.min(esum, osum);
        int gcd = 1;
        for (int j = 1; j <= min; j++) {
            if (esum % j == 0 && osum % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
