public class LC_LongestCont {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int maxLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 4, 7 };
        LC_LongestCont l = new LC_LongestCont();
        System.out.println(l.findLengthOfLCIS(nums));
    }
}
