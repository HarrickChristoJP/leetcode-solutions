class Solution {
    char[][] board;
    List<List<String>> ans;
    int n;
    public List<List<String>> solveNQueens(int n) {
        this.n=n;
        board=new char[n][n];
        ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(0);
        return ans;
    }
    public void backtrack(int row){
        if(row==n){
            List<String> hold=new ArrayList<>();
            for(int i=0;i<n;i++){
                hold.add(new String(board[i]));
            }
            ans.add(hold);
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
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
}