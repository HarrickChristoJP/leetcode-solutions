class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        if(n<1) return ans;
        int open=n,close=n;
        call(open,close,"",ans);
        return ans;

    }
    public static void call(int open,int close,String str,List<String> ans){
        if(open ==0 && close==0){
            ans.add(str);
            return;
        }
        if(open>0) call(open-1,close,str+"(",ans);

        if(close>open) call(open,close-1,str+")",ans);

    }
}