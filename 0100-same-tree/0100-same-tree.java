class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.offer(p);
        q2.offer(q);

        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode curr1=q1.poll(),curr2=q2.poll();

            if(curr1.val!=curr2.val) return false;

            if(curr1.left!=null && curr2.left!=null){
                q1.offer(curr1.left);
                q2.offer(curr2.left);
            }
            else if(curr1.left!=null || curr2.left!=null){
                return false;
            }

            if(curr1.right!=null && curr2.right!=null){
                q1.offer(curr1.right);
                q2.offer(curr2.right);
            }
            else if(curr1.right!=null || curr2.right!=null){
                return false;
            }
        }

        return true;
    }
}