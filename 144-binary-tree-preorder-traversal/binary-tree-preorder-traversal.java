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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr= new ArrayList<>();

        preorderhelper(root,arr);
        return arr;
    }
    private void preorderhelper(TreeNode root, List<Integer> arr){
        if(root==null)
        return;

        arr.add(root.val);
        preorderhelper(root.left, arr);
        preorderhelper(root.right,arr);
    }
}