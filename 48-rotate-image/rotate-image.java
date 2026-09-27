class Solution {
    private void reverserow(int[] row){
        int l=0;
        int r=row.length-1;
        while(l<r){
            int temp=row[l];
            row[l]=row[r];
            row[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverserow(matrix[i]);
        }
    }
}