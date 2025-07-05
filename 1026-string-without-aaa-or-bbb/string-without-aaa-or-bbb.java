class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder result = new StringBuilder();
        int count_a = 0;
        int count_b = 0;

        while (a > 0 || b > 0) {
            if ((a > b && count_a < 2) || count_b == 2 || b == 0) {
                result.append("a");
                a--;
                count_a++;
                count_b = 0;
            } else {
                result.append("b");
                b--;
                count_b++;
                count_a = 0;
            }
        }

        return result.toString();
    }
}
