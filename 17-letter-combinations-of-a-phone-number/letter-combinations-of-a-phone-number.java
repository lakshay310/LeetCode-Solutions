import java.util.*;

class Solution {
    public void solve(String ip, String op, List<String> ans) {
        if (ip.length() == 0) {
            ans.add(op);
            return;
        }

        char ch = ip.charAt(0);
        String newIp = ip.substring(1);

        String[] keyPad = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        String letters = keyPad[ch - '0'];

        for (int i = 0; i < letters.length(); i++) {
            String op1 = op + letters.charAt(i);
            solve(newIp, op1, ans);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String ip = digits;
        String op = "";

        solve(ip, op, ans);

        return ans;
    }
}