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
    public List<Integer> preorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            ans.add(null);
            return ans;
        }

        ans.add(root.val);
        ans.addAll(preorder(root.left));
        ans.addAll(preorder(root.right));

        return ans;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> p1 = preorder(p);
        List<Integer> p2 = preorder(q);

        return p1.equals(p2);
    }
}