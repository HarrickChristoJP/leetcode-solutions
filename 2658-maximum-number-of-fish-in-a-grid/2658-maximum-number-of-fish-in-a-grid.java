class Solution {
    public int findMaxFish(int[][] grid) {
    

        int m=grid.length,n=grid[0].length;
        int ans=0,fin=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    ans=call(grid,i,j,ans);
                    fin=Math.max(ans,fin);
                }
            }
        }
        return fin;
    }
    public int call(int[][] grid,int i,int j,int ans){
        if(i<0 || j<0 || i>grid.length-1||j>grid[0].length-1 ||grid[i][j]==0){
            return 0;
        }
        int total=grid[i][j];
        grid[i][j]=0;

        total+=call(grid,i+1,j,ans);
        total+=call(grid,i,j+1,ans);
        total+=call(grid,i-1,j,ans);total+=call(grid,i,j-1,ans);
        return total;
    }
}