class Solution {

    public int primePalindrome(int n) {
        if(n<=2) return 2;
        if(n<=3) return 3;
        if(n<=5) return 5;
        if(n<=7) return 7;
        if (n <= 11) return 11;
        for (int i = 10; i < 100000; i++) {
            String s = String.valueOf(i);
            String rev = new StringBuilder(s.substring(0, s.length() - 1)).reverse().toString();
            int num = Integer.parseInt(s + rev);
            if (num >= n && isPrime(num)) {
                return num;
            }
        }
        return -1;
    }
    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;
        for (int i = 5; i * i <= n; i += 2) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}