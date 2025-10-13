class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        reverse(chars, 0, n - 1);
        int left = 0, right = 0, i = 0;
        while (i < n) {
            while (i < n && chars[i] == ' ') i++;
            if (i == n) break;
            if (right != 0) chars[right++] = ' ';
            int start = right;
            while (i < n && chars[i] != ' ') {
                chars[right++] = chars[i++];
            }
            reverse(chars, start, right - 1);
        }
        return new String(chars, 0, right);
    }

    private void reverse(char[] chars, int l, int r) {
        while (l < r) {
            char temp = chars[l];
            chars[l++] = chars[r];
            chars[r--] = temp;
        }
    }
}
