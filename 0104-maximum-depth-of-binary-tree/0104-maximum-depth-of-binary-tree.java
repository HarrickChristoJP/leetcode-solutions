/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int ans=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            ans++;
            for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.offer(curr.left);
                
            }
            if(curr.right!=null){
                q.offer(curr.right);
                
            }
            }
        }
        return ans;
    }
}*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=maxDepth(root.left),right=maxDepth(root.right);

        return 1+Math.max(left,right);
    }
}