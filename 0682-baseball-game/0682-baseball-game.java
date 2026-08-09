class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        int k=0;
        int n=operations.length;
        int[]arr= new int[n];
        for(int i=0;i<n;i++)
        {
           if(operations[i].equals("C")){
                arr[k-1] = 0;
                k--;
            }
            else if(operations[i].equals("D")){
                arr[k]=arr[k-1] * 2;
                k++;
            }
            else if(operations[i].equals("+")){
                arr[k] = arr[k-1] + arr[k-2];
                k++;
            }else{
                arr[k] = Integer.parseInt(operations[i]);
                k++;
            }
        }
        for(int a : arr){
            sum=sum + a;
        }
        return sum;
    }
}