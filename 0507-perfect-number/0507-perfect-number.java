class Solution {
    public boolean checkPerfectNumber(int num) {
        int val=0;
        for(int i=1;i<num/2+1;i++){
            if(num%i==0) val+=i;
        }
        return val==num;
    }
}