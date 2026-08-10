class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int n=nums.length;
        
        
       
       for(int i=1;i<n;i++){

            if(nums[i]!=nums[i-1]  ) {
                nums[count]=nums[i];
                count++;
            }

       }
       

       return count;
    }
}