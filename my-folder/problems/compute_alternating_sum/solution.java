public class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (i % 2 == 0 ? 1 : -1) * nums[i];
        }
        return sum;
    }
}
