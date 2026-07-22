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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> bigList=new ArrayList<>();

        // every node has Hd(Col) and Row(level)
        int hd=0;
        int level=0;
        TreeMap<Integer,List<Pair<Integer,Integer>>> treemap=new TreeMap<>();
        helper(root,level,hd,treemap);// traverse node by node and fill DS

        // after fill DS(treeMap)
        for(Integer hdkey:treemap.keySet()){
            List<Pair<Integer,Integer>>pairlist = treemap.get(hdkey);
            pairlist.sort((a,b)->a.getKey().compareTo(b.getKey())==0?a.getValue()-b.getValue(): a.getKey()-b.getKey()); //Lamda expression== Comparision logic Expression[compare method of comparable interface for sorting]
        //  a,getKey()method of Pair class key here is level
            // Inteface Comparable ,Comparator       

        List<Integer> smallList =new ArrayList<>();
        for(Pair<Integer,Integer> pair:pairlist){
            smallList.add(pair.getValue());
        }
        bigList.add(smallList);
    }
    return bigList;
    }

    void helper(TreeNode root,int level,int hd,TreeMap<Integer,List<Pair<Integer,Integer>>> treemap){
        // Base case
        if(root==null){
            return;
        }

        if(!treemap.containsKey(hd)){
            treemap.put(hd,new ArrayList<>());
        }

        treemap.get(hd).add(new Pair(level,root.val));

        // Traverse to left
        helper(root.left,level+1,hd-1,treemap);
        // Traverse to right
        helper(root.right,level+1,hd+1,treemap);
    }
}