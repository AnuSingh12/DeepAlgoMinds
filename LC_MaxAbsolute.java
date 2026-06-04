public class LC_MaxAbsolute {

    public int maxAbsoluteSum(int[] nums) {

        int maxEnding = nums[0];
        int minEnding = nums[0];

        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(nums[i], minEnding + nums[i]);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }

    public static void main(String[] args) {
        int nums[] = { 1, -3, 2, 3, -4 };
        LC_MaxAbsolute n = new LC_MaxAbsolute();
        n.maxAbsoluteSum(nums);
    }
}
