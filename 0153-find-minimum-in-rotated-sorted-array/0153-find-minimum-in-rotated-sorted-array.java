class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1,ans=Integer.MAX_VALUE;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<ans) ans=nums[mid];

            if(nums[mid]>nums[high]) low=mid+1;
            else high=mid-1;
        }
        return ans;
    }
}