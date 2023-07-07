class Solution {
    public int fib(int n) {
         if(n == 1) {
            return 1;
        }

        int prevprev = 0;
        int prev = 1;
        int cur = 0;

        for(int i = 2; i <=n; i++) {
            cur = prevprev + prev;
            prevprev = prev;
            prev = cur;
        }
        return cur;
    }
}