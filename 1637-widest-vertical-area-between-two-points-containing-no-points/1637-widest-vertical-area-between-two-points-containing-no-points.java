class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n=points.length;
        int points_x[] = new int[n];
        for(int i=0; i<n; i++) points_x[i]=points[i][0];
        Arrays.sort(points_x);
        int width=0;
        for(int i=0; i<n-1; i++){
            if (points_x[i+1]-points_x[i]>=width){
                width=points_x[i+1]-points_x[i];
            }
        }
        return width;
    }
}