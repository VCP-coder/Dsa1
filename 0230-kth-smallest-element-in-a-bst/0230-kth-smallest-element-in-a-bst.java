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
    List<Integer> al=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,al);
        return al.get(k-1);
    }
    private List<Integer> dfs(TreeNode root,List<Integer> al){
         if(root==null){
            return new ArrayList<>();
        }
        dfs(root.left,al);
        al.add(root.val);
        dfs(root.right,al);
        return al;
    }
}