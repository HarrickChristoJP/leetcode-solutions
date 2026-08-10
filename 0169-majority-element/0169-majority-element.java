class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int num:nums){

            hash.put(num,hash.getOrDefault(num,0)+1);

        }

        for(int k:hash.keySet()){
            if(hash.get(k)>nums.length/2) return k;
        }

        return -1;
        
    }
}