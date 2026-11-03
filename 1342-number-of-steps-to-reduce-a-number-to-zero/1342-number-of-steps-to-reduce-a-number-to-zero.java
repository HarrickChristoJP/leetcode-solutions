/*class Solution {
    int count=0;
    public int numberOfSteps(int num) {
        if(num==0) return count;
        if(num%2==0){
            numberOfSteps(num/2);
            count++;
        }
        else{
            numberOfSteps(num-1);
            count++;
        }
        return count;
    }
}*/
class Solution {
    public int numberOfSteps(int num) {
        int ans=0;
        while(num!=0){
            if(num%2==0) num/=2;
            else num-=1;
            ans++;
        }
        return ans;
    }
}