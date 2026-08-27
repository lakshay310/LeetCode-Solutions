class Solution {
    public int numDecodings(String s) {
        Integer[] memo = new Integer[s.length()];
        return decode(s, 0, memo);
    }
    private int decode(String s, int ind, Integer[] memo) {
        if (ind == s.length()) {
            return 1;
        }
        if (s.charAt(ind) == '0') {
            return 0;
        }
        if (memo[ind] != null) {
            return memo[ind];
        }
        int ways = decode(s, ind + 1, memo);
        if (ind + 1 < s.length()) {
            int twoDigit = Integer.parseInt(s.substring(ind, ind + 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                ways += decode(s, ind + 2, memo);
            }
        }
        memo[ind] = ways;
        return ways;
    }
}