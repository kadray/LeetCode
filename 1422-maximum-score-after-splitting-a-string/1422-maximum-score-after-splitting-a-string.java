class Solution {
    public int maxScore(String s) {
        String left;
        String right;
        int left_val;
        int right_val;
        int result=0;
        for (int i=1; i<s.length(); i++){
            left=s.substring(0,i);
            right=s.substring(i);
            left_val=0;
            right_val=0;            
            for(char x: left.toCharArray()){
                if(x=='0') left_val++;
            }
            for(char x: right.toCharArray()){
                if(x=='1') right_val++;
            }
            if(left_val+right_val>result) result=left_val+right_val;
        }
        return result;
    }
}