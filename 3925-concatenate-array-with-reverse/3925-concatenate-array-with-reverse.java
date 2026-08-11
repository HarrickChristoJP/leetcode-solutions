class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr=new int[nums.length*2];

        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int index=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            arr[index++]=nums[i];
        }
        return arr;
    }
}