class Solution {
    public int differenceOfSum(int[] nums) {
        int first=0,sec=0;
        for(int num:nums){
            first+=num;
            int ans=0;
            while(num>0){
                int rem=num%10;
                ans+=rem;
                num/=10;
            }
            sec+=ans;
        }
        return Math.abs(first-sec);
        
        
    }
}