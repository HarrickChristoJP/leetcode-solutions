class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>high) high=piles[i];
        }
        int ans=high;//if the conditions do not satisfy

        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=0;

            for(int num:piles){
                hours+=(int)(num+mid-1)/mid;//hours+=(long)Math.ceil((double)num,mid);
            }
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}