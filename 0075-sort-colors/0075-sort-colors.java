/*class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[min]) min=j;
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
    }
}selection sort*/
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;

        for(int i=n-1;i>0;i--){
            boolean flag=true;
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=false;
                }
                
            }
            if(flag) break;

        }
    }
}