
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);

        int[] ans = new int[queries.length];

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= queries[i]) {
                    count++;
                } else {
                    break;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
