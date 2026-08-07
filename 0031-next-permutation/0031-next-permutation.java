class Solution {
    public static void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    public static void reverse(int[]nums,int left,int right){
        int i=left,j=right;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot!=-1){
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[pivot]){
                    swap(nums,i,pivot);
                    break;
                }
            }
        }
        reverse(nums,pivot+1,n-1);

    }
}