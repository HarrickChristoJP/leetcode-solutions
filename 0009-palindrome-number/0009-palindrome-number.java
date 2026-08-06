class Solution {
    public boolean isPalindrome(int x) {
        
        int n=x;

        int result=0;

        if(x<0) return false;

        while(x!=0){
            int rem=x%10;
            result=result*10+rem;
            x/=10;

        }
        if(n==result){
            return true;
        } 

        return false;
    }
}