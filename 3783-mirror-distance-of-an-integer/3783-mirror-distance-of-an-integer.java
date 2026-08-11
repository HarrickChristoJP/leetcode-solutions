class Solution {
    public int mirrorDistance(int n) {
        int ans=0,N=n;
        while(n>0){
            int r=n%10;
            ans=ans*10+r;
            n/=10;
        }
        return Math.abs(N-ans);
    }
}