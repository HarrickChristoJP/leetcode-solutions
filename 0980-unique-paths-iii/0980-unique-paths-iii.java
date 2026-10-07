class Solution {
    int ans,rows,cols;
    public int uniquePathsIII(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int startRow = 0,startCol = 0,empty = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] != -1){
                    empty++;
                }
                if(grid[i][j] == 1){
                    startRow = i;
                    startCol = j;
                }
            }
        }
        ans = 0;
        backtrack(grid, startRow, startCol, empty);
        return ans;
    }

    public void backtrack(int[][] grid, int row, int col, int empty) {
        if(grid[row][col] == 2){
            if(empty == 1){
                ans++;
            }
            return;
        }
        grid[row][col] = -1;
        empty--;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        for(int i = 0; i < 4; i++){
            int nr = row + dr[i];
            int nc = col + dc[i];
            if(nr >= 0 && nr < rows &&
               nc >= 0 && nc < cols &&
               grid[nr][nc] != -1){

                backtrack(grid, nr, nc, empty);
            }
        }

        grid[row][col] = 0;
    }
}