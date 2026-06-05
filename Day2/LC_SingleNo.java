import java.util.HashSet;

public class LC_SingleNo {
    public int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.iterator().next();
    }

    public static void main(String[] args) {
        LC_SingleNo ob = new LC_SingleNo();

        int[] nums = { 4, 1, 2, 1, 2 };

        System.out.println(ob.singleNumber(nums));
    }
}
