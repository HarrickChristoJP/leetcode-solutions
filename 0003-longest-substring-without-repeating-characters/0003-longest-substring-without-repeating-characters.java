class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash=new HashSet<>();

        int left=0,right=0,ans=0;
        while(left<s.length()&&right<s.length()){
            while(hash.contains(s.charAt(right))){
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(s.charAt(right));
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}