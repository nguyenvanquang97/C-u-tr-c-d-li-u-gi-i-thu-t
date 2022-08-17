class Bai4 {
    public static void main(String[] args) {
        char[][] clone= {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        Bai4 bai4=new Bai4();
        boolean a=bai4.isValidSudoku(clone);
        System.out.println(a);
    }
    public boolean isValidSudoku(char[][] board) {
        return checkValidity(board, 0, 0);
    }

    boolean checkValidity(char[][] board, int i, int j){
        if(i == board.length)
            return true;
        int ni = 0;
        int nj = 0;
        if(board[0].length - 1 == j){
            ni = i + 1;
            nj = 0;
        }else{
            ni = i;
            nj = j + 1;
        }
        if(board[i][j] == '.')
            return checkValidity(board, ni, nj);
        else{
            for(int c = 0; c < board.length; c++){
                if(board[i][j] == board[c][j] && c != i)
                    return false;
                if(board[i][j] == board[i][c] && c != j)
                    return false;
            }
            int smi = i/3 * 3;
            int smj = j/3 * 3;
            for(int mi = 0; mi < 3; mi++){
                for(int mj = 0; mj < 3; mj++){
                    if(mi + smi != i && mj + smj != j && board[i][j] == board[mi + smi][mj + smj])
                        return false;
                }
            }
            return checkValidity(board, ni, nj);
        }
    }
}