class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        List<Integer> result = new ArrayList<>();
        if (time == 0) {
            for (int i = 0; i < n; i++) {
                result.add(i);
            }
            return result;
        }
        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            if (security[i] <= security[i - 1]) {
                prefix[i] = prefix[i - 1] + 1;
            }
        }
        int[] suffix = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                suffix[i] = suffix[i + 1] + 1;
            }
        }
        for (int i = time; i < n - time; i++) {
            if (prefix[i] >= time && suffix[i] >= time) {
                result.add(i);
            }
        }
        
        return result;
    }
}