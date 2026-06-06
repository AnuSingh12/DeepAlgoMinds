public class LC_Sqrt {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long ans = 0;
        if (x == 0 || x == 1) {
            return x;
        }
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = (int) mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int x = 4;
        LC_Sqrt sq = new LC_Sqrt();
        System.out.println(sq.mySqrt(x));
    }
}
