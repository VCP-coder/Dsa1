class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int maxt[]=new int[col];
        int k=0;
        for(int j=0;j<col;j++){
            int max=0;
            for(int i=0;i<row;i++){
                max=Math.max(max,matrix[i][j]);
            }
        maxt[k]=max;
        k++;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=maxt[j];
                }
            }
        }
    return matrix;
    }
}