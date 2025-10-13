class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;
        boolean neg = false;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+'))
            neg = s.charAt(i++) == '-';
        long ans = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i++) - '0');
            if (ans > Integer.MAX_VALUE)
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return (int)(neg ? -ans : ans);
    }
}