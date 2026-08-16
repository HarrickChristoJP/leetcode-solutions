class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=nums[0];
        for(int num:nums){
            if(num>high) high=num;
        }
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;
            int no=0;
            for(int num:nums) no+=(num+mid-1)/mid;

            if(no<=threshold){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}