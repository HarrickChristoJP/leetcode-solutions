class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length,low=0,high=0;
        for(int num:weights){
            if(num>low) low=num;
            high+=num;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int day=1,load=0;
            for(int i=0;i<n;i++){
                load+=weights[i];
                if(load>mid){
                    day++;
                    load=weights[i];
                }
            }
            if(day<=days){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;

        }
        return ans;
    }
}