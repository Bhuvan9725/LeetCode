class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        if(rows==0){
            return;
        }
        int cols=matrix[0].length;
        boolean[] zrows=new boolean[rows];
        boolean[] zcols=new boolean[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    zrows[i]=true;
                    zcols[j]=true;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(zrows[i]||zcols[j]){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}