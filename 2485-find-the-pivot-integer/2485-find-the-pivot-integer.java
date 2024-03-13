class Solution {
    public int pivotInteger(int n) {
        int xl=0;
        int suml=0;
        int xr=n;
        int sumr=n;
        while(xl<=xr){
            if(suml<sumr){
                xl++;
                suml+=xl;
            }
            else{
                xr--;
                sumr+=xr;
            }
        if(suml==sumr && xl==xr) return xl;
        }
        return -1;
    }
}