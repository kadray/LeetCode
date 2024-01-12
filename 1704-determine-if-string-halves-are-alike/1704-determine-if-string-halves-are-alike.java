class Solution {
    public boolean halvesAreAlike(String s) {
        char[] vowels = {'a', 'e', 'o', 'u', 'i'};
        String a=s.substring(0, s.length()/2);
        String b=s.substring(s.length()/2);
        char[] a_char=a.toCharArray();
        char[] b_char=b.toCharArray();
        int a_count=0;
        int b_count=0;
        for(int i=0; i<a_char.length; i++){
            for(char e:vowels){
                if(e==Character.toLowerCase(a_char[i])) a_count++;
                if(e==Character.toLowerCase(b_char[i])) b_count++;
            }
        }
        return a_count==b_count;
    }
}