class Solution {
    public int reverse(int x) {
        int ans = 0;
        boolean flag = false;

        if (x < 0) {
            if (x == Integer.MIN_VALUE) return 0;
            x *= -1;
            flag = true;
        }

        while (x > 0) {
            int lastDig = x % 10;

            if (ans > (Integer.MAX_VALUE - lastDig) / 10) {
                return 0;
            }

            ans = ans * 10 + lastDig;
            x = x / 10;
        }

        if (flag) ans *= -1;

        return ans;
    }
}