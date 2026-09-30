class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i + n / 4 < n && arr[i] == arr[i + n / 4]) {
                return arr[i];
            }
        }

        return -1;
    }
}