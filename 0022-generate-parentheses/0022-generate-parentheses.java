/*class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        if(n<1) return ans;
        int open=n,close=n;
        call(open,close,"",ans);
        return ans;

    }
    public static void call(int open,int close,String str,List<String> ans){
        if(open ==0 && close==0){ //when we open & closed all the paranthesis
            ans.add(str);// which the above is the base case
            return;//
        }
        if(open>0) call(open-1,close,str+"(",ans); // we should always start with  the open brackets 

        if(close>open) call(open,close-1,str+")",ans);
        //closing the paranthesis
    }
}*/


class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans =new ArrayList<>();
        call(ans,n,n,"");
        return ans;
    }
    public static void call(ArrayList<String> ans,int open,int close,String str){
        if(open==0 && close==0){
            ans.add(str);
            return;
        }
        if(open>0) call(ans,open-1,close,str+"(");
        if(close>open) call(ans,open,close-1,str+")");
    }
}