class Solution {
    public int fib(int n) {
        int fp=0;
        int fn=1;
        for(int i=1; i<=n/2;i++){
            fp=fp+fn;
            fn=fp+fn;
        }
        return n%2==0 ? fp : fn;
    }
}