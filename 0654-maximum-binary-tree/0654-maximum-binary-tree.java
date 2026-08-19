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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length);
    }
    private TreeNode construct(int nums[],int l,int r){
        if(l==r){
            return null;
        }
        int index=l;
        for(int i=l;i<r;i++){
            if(nums[index]<nums[i]){
                index=i;
            }
        }
        TreeNode root=new TreeNode(nums[index]);
        root.left=construct(nums,l,index);
        root.right=construct(nums,index+1,r);
        return root;
    }
}