class Solution {
    public boolean isPowerOfTwo(int n) {
        double x=Math.log10(n)/Math.log10(2); 
        return x == (int) x ? true : false;
    }
}