class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int index=nums.length;
        for(int i=0;i<nums.length;i++){
            arr[index++]=nums[i];
        }
        return arr;
        
    }
}