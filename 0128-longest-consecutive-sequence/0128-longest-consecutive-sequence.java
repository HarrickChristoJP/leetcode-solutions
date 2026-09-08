class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> hash=new HashSet<>();

        for(int num:nums) hash.add(num);
        int ans=0;
        for(int num:hash){
            if(!hash.contains(num-1)){
                int current=num;
                int len=1;
            
                while(hash.contains(current+1)){
                    current++;len++;
                }
                ans=Math.max(ans,len);
            }
        }
        return ans;
    }

}