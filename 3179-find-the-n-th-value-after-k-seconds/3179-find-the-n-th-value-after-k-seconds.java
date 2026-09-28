class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int MOD = 1000000007;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        for (int time = 0; time < k; time++) {

            for (int i = 1; i < n; i++) {
                arr[i] = (arr[i] + arr[i - 1]) % MOD;
            }
        }
        return arr[n - 1];
    }
}