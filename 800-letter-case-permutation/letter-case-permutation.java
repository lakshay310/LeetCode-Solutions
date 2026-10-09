import java.util.*;

class Solution {
    public void solve(String ip, String op, List<String> result) {
        if (ip.length() == 0) {
            result.add(op);
            return;
        }
        char ch = ip.charAt(0);
        String ros = ip.substring(1); 
        if (Character.isLetter(ch)) {
            solve(ros, op + Character.toLowerCase(ch), result);
            solve(ros, op + Character.toUpperCase(ch), result);
        } else {
            solve(ros, op + ch, result);
        }
    }

    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) return result;
        solve(s, "", result);
        return result;
    }
}