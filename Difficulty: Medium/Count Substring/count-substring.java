class Solution {
    public static int countSubstring(String s) {
        // code here
        int count=0;
        String a="a";
        String b="b";
        String c="c";
         for (int i = 0; i < s.length(); i++) {
            boolean hasA = false, hasB = false, hasC = false;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == 'a') hasA = true;
                if (ch == 'b') hasB = true;
                if (ch == 'c') hasC = true;

                if (hasA && hasB && hasC) {
                    count += (s.length() - j);  
                    break;
                }
            }
        }
        return count;
        
    }
}
