class Solution {
    public int countPrimes(int n) {
        if (n <= 1) return 0;
        boolean isComposite[] = new boolean[n];
        int cnt = 0;
        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!isComposite[i])
                cnt++;
        }
        return cnt;
    }
}