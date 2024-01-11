class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int maxArea = 0;
        int diag = 0;
        for (int i =0; i <d.length; i++){
            int currDiag = (d[i][0] * d[i][0]) + (d[i][1]*d[i][1]);
            
            if (currDiag > diag || (currDiag == diag && maxArea < d[i][1]*d[i][0])){
                diag = currDiag;
                maxArea = d[i][1] * d[i][0];
            }
        }
        return maxArea;
    }
}