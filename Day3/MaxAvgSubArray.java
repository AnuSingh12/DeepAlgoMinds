public class MaxAvgSubArray {
    public double findMaxAverage(int[] nums, int k) {
        long curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }
        long max = curr;
        for (int i = k; i < nums.length; i++) {

            curr = curr - nums[i - k] + nums[i];

            if (curr > max) {
                max = curr;
            }
        }
        return (double) max / k;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        MaxAvgSubArray avg = new MaxAvgSubArray();
        System.out.println(avg.findMaxAverage(nums, k));
    }
}
