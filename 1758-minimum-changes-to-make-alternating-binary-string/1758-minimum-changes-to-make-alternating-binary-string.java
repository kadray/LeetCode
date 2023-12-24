class Solution {
    public int minOperations(String s) {
        char[] list = s.toCharArray();
        int result = 0;
        int result2= 0;
        for (int i = 0; i < list.length ; i++) {
            if((list[i]=='1' && i%2!=0) || (list[i]=='0' && i%2==0)) result++;
            if((list[i]=='0' && i%2!=0) || (list[i]=='1' && i%2==0)) result2++;
        }
        return Math.min(result, result2);
    }
}