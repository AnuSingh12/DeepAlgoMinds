import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LC_ThirdMax {
    public int thirdMax(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        if (list.size() < 3) {
            return list.get(list.size() - 1);
        }

        return list.get(list.size() - 3);
    }

    public static void main(String[] args) {

        LC_ThirdMax ob = new LC_ThirdMax();

        int[] nums = { 2, 2, 3, 1 };

        System.out.println(ob.thirdMax(nums));
    }

}
