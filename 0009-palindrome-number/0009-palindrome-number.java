class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int num=reverse(x);
        return num==x;
    }
    public static int reverse(int x){
        int num=0;
        while(x!=0){
            int r=x%10;
            num=num*10+r;
            x=x/10;
        }
        return num;
    }
}