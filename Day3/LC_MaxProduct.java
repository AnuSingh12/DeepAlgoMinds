import java.util.Arrays;

public class LC_MaxProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int p2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(p1, p2);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        LC_MaxProduct p = new LC_MaxProduct();
        System.out.println(p.maximumProduct(nums));
    }
}
