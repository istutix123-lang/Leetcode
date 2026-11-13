
import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {

        while (stones.length > 1) {

            Arrays.sort(stones);

            int n = stones.length;

            int a = stones[n - 1];
            int b = stones[n - 2];

            int[] newStones = new int[n - 2];

            for (int i = 0; i < n - 2; i++) {
                newStones[i] = stones[i];
            }

            if (a != b) {
                newStones = Arrays.copyOf(newStones, n - 1);
                newStones[n - 2] = a - b;
            }

            stones = newStones;
        }

        return stones.length == 0 ? 0 : stones[0];
    }
}
