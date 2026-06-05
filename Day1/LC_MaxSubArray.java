public class LC_MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        LC_MaxSubArray n = new LC_MaxSubArray();
        System.out.println(n.maxSubArray(nums));
    }
}
