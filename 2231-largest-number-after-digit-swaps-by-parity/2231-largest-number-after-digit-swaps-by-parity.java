
class Solution {
    public int largestInteger(int num) {
        int[] digits = new int[10];
        int temp = num;

        while (temp > 0) {
            digits[temp % 10]++;
            temp = temp / 10;
        }

        int ans = 0;
        temp = num;

        int[] original = new int[10];
        int n = 0;

        while (temp > 0) {
            original[n] = temp % 10;
            n++;
            temp = temp / 10;
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = original[i];
            int chosen = digit % 2 == 0 ? 8 : 9;

            while (chosen >= 0 && digits[chosen] == 0) {
                chosen -= 2;
            }

            ans = ans * 10 + chosen;
            digits[chosen]--;
        }

        return ans;
    }
}
