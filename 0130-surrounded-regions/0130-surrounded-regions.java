class Solution {
    public void solve(char[][] board) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<n;i++){//for the 1st row & last row
            if(board[0][i]=='O'){
                call(board,0,i);
            }
            if(board[m-1][i]=='O'){//for the last row
                call(board,m-1,i);
            }
        }
        //checking the 1st & the last column
        for(int i=0;i<m;i++){
            if(board[i][0]=='O') call(board,i,0);

            if(board[i][n-1]=='O') call(board,i,n-1);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='a') board[i][j]='O';
            }
        }

    }
    public static void call(char[][] board,int row,int col){
        if(row<0 ||row>=board.length||col<0 ||col>=board[0].length||board[row][col]!='O'){
            return;
        }
        board[row][col]='a';
        call(board,row+1,col);
        call(board,row-1,col);
        call(board,row,col+1);
        call(board,row,col-1);
    }
}