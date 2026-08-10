class Solution {
    public void moveZeroes(int[] nums) {
        int count=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0) nums[count++]=nums[i];
        }
        while(count<=nums.length-1){
            nums[count++]=0;
        }
    }
}