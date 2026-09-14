import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childI = 0;
        int cookieI = 0;
        // Iterate through both arrays
        while (childI < g.length && cookieI < s.length) {
            // If the current cookie can satisfy the current child
            if (s[cookieI] >= g[childI]) {
                childI++; // Move to the next child
            }
            // Always move to the next cookie
            cookieI++;
        }
        return childI;
    }
}