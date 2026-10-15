class Solution {
    public boolean solve(char[][] board, int row, int col) {
        // Base case: all rows are completed
        if (row == 9) {
            return true;
        }

        // Calculate the next cell
        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        // If the cell is already filled, skip it
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }
        // Try digits from 1 to 9
        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                // Place the digit
                board[row][col] = digit;
                // Recursively solve the next cell
                if (solve(board, nextRow, nextCol)) {
                    return true;
                }
                // Backtrack: undo the placement
                board[row][col] = '.';
            }
        }
        // No digit works for this cell
        return false;
    }
    public boolean isSafe(char[][] board, int row, int col, char digit) {
        // Check the row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) {
                return false;
            }

            if (board[i][col] == digit) {
                return false;
            }
        }
        // Find the starting position of the 3x3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        // Check the 3x3 box
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}