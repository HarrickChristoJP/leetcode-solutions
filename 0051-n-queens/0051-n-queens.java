
class Solution {
    char[][] board;
    List<List<String>> ans;
    int n;
    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        board=new char[n][n];
        this.n=n;
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(0);
        return ans;
    }
    public List<String> construct(char[][] board){
        List<String> sol=new ArrayList<>();
        for(char[] row:board){
            sol.add(new String(row));
        }
        return sol;
    }
    public void backtrack(int row){
        if(row==n){
            ans.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(check(row,col)){
                board[row][col]='Q';
                backtrack(row+1);
                board[row][col]='.';
            }
        }
    }

    public boolean check(int row,int col){
        // check col
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        // left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--, j--){
            if(board[i][j]=='Q') return false;
        }
        // right diagonal
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
}
