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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int vl:to_delete){
            set.add(vl);
        }
        dfs(root,set,list);
        if(!set.contains(root.val)){
            list.add(root);
            
        }
        return list;
    }
    public TreeNode dfs(TreeNode root,HashSet<Integer> set,List<TreeNode> list ){
        if(root==null){
            return null;
        }
        root.left=dfs(root.left,set,list);
        root.right=dfs(root.right,set,list);
        if(set.contains(root.val)){
            if(root.left!=null){
                list.add(root.left);
            }
            if(root.right!=null){
                list.add(root.right);
            }
            return null;
        }else{
            return root;
        }
        
    }
}