class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;

        while(low<high){
            int mid=low+(high-low)/2;
            
            if(mid%2==1) mid-=1 ;//we are converting this to an even no

            if(nums[mid]==nums[mid+1]){//checking if the left & righj (odd & even are same)
                low=mid+2; // uodating it 2 times to skip the dupliacte
            }

            else high=mid ;//the braek has occured dupliacte will now be at low
        }
        return nums[low];
    }
}