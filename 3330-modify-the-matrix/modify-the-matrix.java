class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int k=0;
        int maxcol[]=new int[col];
        for(int j=0;j<col;j++){
            int max=0;
            for(int i=0;i<row;i++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        maxcol[k]=max;
        k++;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=maxcol[j];
                }
            }
        }
    return matrix;
    }
}