import java.util.Arrays;

public class LC_KthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        LC_KthLargest n = new LC_KthLargest();
        System.out.println(n.findKthLargest(nums, k));
    }
}
