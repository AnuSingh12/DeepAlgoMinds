import java.util.Arrays;

public class LC_Rearrange {
    public int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };
        LC_Rearrange n = new LC_Rearrange();
        System.out.println(Arrays.toString(n.rearrangeArray(nums)));
    }
}
