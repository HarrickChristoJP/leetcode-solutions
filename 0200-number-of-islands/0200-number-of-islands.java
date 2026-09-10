class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        boolean[][] arr=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && arr[i][j]==false) count++;
                change(grid,i,j,arr);
            }
        }
        return count;
    }
    public static void change(char[][] grid,int i,int j,boolean[][] arr){
        if(i>=0 &&i<grid.length &&j>=0 &&j<grid[0].length && grid[i][j]=='1' && arr[i][j]==false){
            arr[i][j]=true;
        }
        else return;

        change(grid,i+1,j,arr);
        change(grid,i-1,j,arr);
        change(grid,i,j+1,arr);
        change(grid,i,j-1,arr);
    }
}