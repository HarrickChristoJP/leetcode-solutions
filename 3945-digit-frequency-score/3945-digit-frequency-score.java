class Solution {
    public int digitFrequencyScore(int n) {
        int holder=n;
        int ans=0;

        while(holder>0){
            ans+=holder%10;
            holder/=10;

        }
        return ans;
    }
}