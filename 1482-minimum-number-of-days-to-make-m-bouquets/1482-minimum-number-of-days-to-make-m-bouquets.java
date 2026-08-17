class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE,high=0,fin=-1;
        long total=(long)m*k;
        if(total>bloomDay.length) return -1;

        for(int num:bloomDay){
            if(num>high) high=num;
            if(num<low) low=num;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            int consec=0,bouq=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    consec++;
                    if(consec==k){
                        bouq++;
                        consec=0;
                    }
                }
                else consec=0;
            }
            if(bouq>=m){
                fin=mid;
                high=mid-1;
            }

            else low=mid+1;
        }
        return fin;
    }
}