class Solution {
    public int fib(int n) {
        // if(n==0||n==1) return n;
        // return fib(n-1)+fib(n-2);
        int a=0, b=1, c=0;
        if(n==1) return n;
        for(int i=1; i<n;i++){
            c=a+b;
            a=b;b=c;
        }
        return c;
    }
}
