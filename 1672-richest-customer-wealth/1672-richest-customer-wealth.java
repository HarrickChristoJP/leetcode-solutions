class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0,count=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                ans+=accounts[i][j];
                count=Math.max(ans,count);
            }
            ans=0;
        }
        return count;
    }
}