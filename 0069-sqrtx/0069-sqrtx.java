class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int low=1,high=x/2,ans=0;

        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid<=x){
                ans=(int)mid;
                low=(int)mid+1;
            }
            else high=(int)mid-1;
        }
        return ans;
    }
}