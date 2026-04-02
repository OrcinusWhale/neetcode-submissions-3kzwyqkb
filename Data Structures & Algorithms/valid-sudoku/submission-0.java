class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];
        for (int i=0; i<9; ++i) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int i=0; i<board.length; ++i) {
            for (int j=0; j<board[i].length; ++j) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (rows[i].contains(board[i][j])) {
                    return false;
                }
                if (columns[j].contains(board[i][j])) {
                    return false;
                }
                if (squares[(i/3)*3 + j/3].contains(board[i][j])) {
                    return false;
                }
                rows[i].add(board[i][j]);
                columns[j].add(board[i][j]);
                squares[(i/3)*3 + j/3].add(board[i][j]);
            }
        }
        return true;
    }
}