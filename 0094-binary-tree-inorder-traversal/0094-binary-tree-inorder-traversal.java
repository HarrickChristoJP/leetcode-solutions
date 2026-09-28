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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        call(root,arr);
        return arr;
    }
    public static void call(TreeNode root,ArrayList arr){
        if(root==null) return;
        call(root.left,arr);
        arr.add(root.val);
        call(root.right,arr);
    }
}