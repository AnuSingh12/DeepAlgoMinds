import java.util.HashSet;

public class LC_Missingno {
    public int missingNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LC_Missingno ob = new LC_Missingno();

        int[] nums = { 3, 0, 1 };

        System.out.println(ob.missingNumber(nums));
    }
}
