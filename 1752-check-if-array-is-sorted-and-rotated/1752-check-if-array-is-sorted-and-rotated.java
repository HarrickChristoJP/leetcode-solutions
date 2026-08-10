class Solution {
    public boolean check(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) ans++;
        }
        if(nums[0]<nums[nums.length-1]) ans++;

        return ans<=1;
    }
}