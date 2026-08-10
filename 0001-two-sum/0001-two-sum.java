class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(hash.containsKey(value)){
                return new int[]{hash.get(value),i};
            }
            hash.put(nums[i],i);
        }
        return new int[]{};
    }
}