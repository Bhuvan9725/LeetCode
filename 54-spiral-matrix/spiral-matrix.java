class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> s=new ArrayList<>();
        if(matrix.length==0 ||matrix[0].length==0){
            return new ArrayList<>();
        }
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int col=left;col<=right;col++){
                s.add(matrix[top][col]);
            }
            top++;
            for(int row=top;row<=bottom;row++){
                s.add(matrix[row][right]);
            }
            right--;
            if(top<=bottom){
                for(int col=right;col>=left;col--){
                     s.add(matrix[bottom][col]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    s.add(matrix[row][left]);
                }
                left++;
            }
        }
        return s;
    }
}