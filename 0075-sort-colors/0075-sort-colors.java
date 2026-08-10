class Solution {
    public void sortColors(int[] nums) {

        int count=0;

        

        for(int i=0;i<nums.length;i++){

            

            if(nums[i]==0){
                
                nums[i]=nums[count];
                nums[count]=0;
                count++;
            }
        }

        

        for(int j=count;j<nums.length;j++) {

            
            
            if(nums[j]==1){
                
                nums[j]=nums[count];
                nums[count]=1;
                count++;

            }
        }
        
    }
}