class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hash=new HashMap<>();
        hash.put(0,1);
        int n=nums.length,sum=0,ans=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            int prev=sum-k;
            if(hash.containsKey(prev)){
                ans+=hash.get(prev);
            }
            hash.put(sum,hash.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}