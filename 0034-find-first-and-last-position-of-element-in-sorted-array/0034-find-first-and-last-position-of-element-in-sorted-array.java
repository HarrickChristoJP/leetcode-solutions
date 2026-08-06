class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=low(nums,target),second=high(nums,target);
        
        return new int[]{first,second};
    }
    public static int low(int[] nums,int t){
        int l=0,h=nums.length-1,ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==t){
                ans=m;
                h=m-1;
            }
            else if(nums[m]>t) h=m-1;
            else l=m+1;
        }
        return ans;
    }
    public static int high(int[] nums,int target){
        int l=0,h=nums.length-1,ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target){
                ans=m;
                l=m+1;
            }
            else if(nums[m]<target) l=m+1;
            else h=m-1;
        }
        return ans;
    }

}