class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int dist=0,ans=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') stack.push(i);
            else if(c==')'){
                stack.pop();
                if(!stack.empty()){
                    dist=i-stack.peek();
                    ans=Math.max(dist,ans);
                }
                else{
                    stack.push(i);
                }
            }
        }
        return ans;
    }
}