class Solution {
    public boolean isPathCrossing(String path) {
        int[] pos = { 0, 0 };
        int[][] pos_tab = new int[path.length()][2];
        char[] direction = path.toCharArray();
        for (int i = 0; i < path.length(); i++) {
            switch (direction[i]) {
                case 'N':
                    pos[0]++;
                    break;
                case 'S':
                    pos[0]--;
                    break;
                case 'E':
                    pos[1]++;
                    break;
                case 'W':
                    pos[1]--;
                    break;
            }
            for (int[] subArray : pos_tab) {
                if (Arrays.equals(subArray, pos)) {
                    return true;
                }
            }

            pos_tab[i][0] = pos[0];
            pos_tab[i][1] = pos[1];

        }
        return false;
    }
}