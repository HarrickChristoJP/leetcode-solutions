class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=-1,second=-1,low=0,high=n-1,low1=0,high1=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        while(low1<=high1){
            int mid=low1+(high1-low1)/2;
            if(nums[mid]==target){
                second=mid;
                low1=mid+1;
            }
            else if(nums[mid]<target) low1=mid+1;
            else high1=mid-1;
        }
        return new int[]{first,second};

    }
}