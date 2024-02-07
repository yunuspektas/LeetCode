package easy.two_sum;

// brute force
// Complexity : O(n2)
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if ((nums[i] + nums[y]) == target) {
                    sum[0] = i;
                    sum[1] = y;
                }
            }
        }
        return sum;
    }
}
