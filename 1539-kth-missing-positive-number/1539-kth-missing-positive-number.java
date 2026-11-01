class Solution {
    public int findKthPositive(int[] arr, int k) {

        int count = 0;
        int num = 1;

        while (true) {

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                count++;
            }

            if (count == k) {
                return num;
            }

            num++;
        }
    }
}