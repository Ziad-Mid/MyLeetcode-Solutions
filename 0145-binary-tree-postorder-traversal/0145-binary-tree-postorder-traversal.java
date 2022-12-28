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
    // Collections.reverse(Arrays.asList(a));
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        
        List<Integer> res = traversePostOrder(root,l);
        
        
        
        return res;
        
    }
    
    public List<Integer> traversePostOrder(TreeNode node,List<Integer> res) {
        
        
        if (node != null) {
             
            traversePostOrder(node.left,res);
            traversePostOrder(node.right,res);
           
            res.add(node.val);
        }
        
        return res;
    }
    
}