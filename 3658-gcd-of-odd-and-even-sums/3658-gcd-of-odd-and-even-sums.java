class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0,even=0;
        while(n>0){
            odd+=2*n-1;
            even+=2*n;
            n--;
        }
        while(even!=0){
            int r=odd%even;
            odd=even;
            even=r;
        }
        return odd;
    }
}