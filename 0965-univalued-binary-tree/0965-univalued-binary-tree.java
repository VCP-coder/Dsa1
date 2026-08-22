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
    List<Integer> value=new ArrayList<>();
    public boolean isUnivalTree(TreeNode root) {
        dfs(root);
        for(int v:value){
            if(v!=value.get(0)){
                return false;
            }
        }
    return true;
    }
    public List<Integer> dfs(TreeNode node){
        if(node !=null){
            value.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    return value;
    }
}