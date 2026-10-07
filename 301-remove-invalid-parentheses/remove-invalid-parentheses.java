class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> validSet = new HashSet<>();
        int maxLen = 0;
        maxLen = generate(s, 0, "", validSet, maxLen);
        List<String> result = new ArrayList<>();
        for (String str : validSet) {
            if (str.length() == maxLen) {
                result.add(str);
            }
        }
        return result;
    }
    private int generate(String s, int index, String current, Set<String> validSet, int maxLen) {
        if (index == s.length()) {
            if (isValid(current)) {
                if (current.length() >= maxLen) {
                    validSet.add(current);
                    return current.length();
                }
            }
            return maxLen;
        }
        int len1 = generate(s, index + 1, current + s.charAt(index), validSet, maxLen);
        int len2 = maxLen;
        if (s.charAt(index) == '(' || s.charAt(index) == ')') {
            len2 = generate(s, index + 1, current, validSet, maxLen);
        }
        return Math.max(len1, len2);
    }
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else if (c == ')') count--;
            if (count < 0) return false;
        }
        return count == 0;
    }
}