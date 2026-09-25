class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        if (totalSum % 3 != 0) {
            return false;
        }
        int target = totalSum / 3;
        int currentSum = 0;
        int parts = 0;

        for (int num : arr) {
            currentSum += num;

            if (currentSum == target) {
                parts++;
                currentSum = 0;
            }
        }

        return parts >= 3;
    }
}