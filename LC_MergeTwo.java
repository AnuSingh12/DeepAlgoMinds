import java.util.Arrays;

public class LC_MergeTwo {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m;

        for (int i = 0; i < n; i++) {
            nums1[k] = nums2[i];
            k++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;

        int nums2[] = { 2, 5, 6 };
        int n = 3;

        LC_MergeTwo obj = new LC_MergeTwo();

        obj.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
