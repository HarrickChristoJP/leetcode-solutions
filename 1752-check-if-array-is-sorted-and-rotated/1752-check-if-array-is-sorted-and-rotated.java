class Solution {
    public boolean check(int[] nums) {
        int count=0,n=nums.length;
        if(nums[0]<nums[n-1]) count++;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]) count++;
        }
        return count<=1;

        
    }
}