class Solution {
    public int calculate(String s) {
        int result = 0, num = 0, sign = 1;
        int[] stack = new int[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack[++top] = result;
                stack[++top] = sign;
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack[top--];
                result += stack[top--];
            }
        }
        return result + sign * num;
    }
}