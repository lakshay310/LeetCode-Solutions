class NumMatrix {
    int[][] mat;
    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int r = matrix.length;
        int c = matrix[0].length;
        mat = new int[r + 1][c + 1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i + 1][j + 1] = matrix[i][j] + mat[i][j + 1] + mat[i + 1][j] - mat[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return mat[row2 + 1][col2 + 1] - mat[row1][col2 + 1] - mat[row2 + 1][col1] + mat[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */