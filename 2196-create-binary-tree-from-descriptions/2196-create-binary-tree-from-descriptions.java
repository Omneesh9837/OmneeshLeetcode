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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int[] arr:descriptions){
            int par=arr[0];
            int ch=arr[1];
            int lt=arr[2];
            map.putIfAbsent(par,new TreeNode(par));
            map.putIfAbsent(ch,new TreeNode(ch));
            if(lt==1){
                map.get(par).left=map.get(ch);
                
            }else if(lt==0){
                map.get(par).right=map.get(ch);
                
            }
            set.add(ch);
        }
        for(int[]ar:descriptions){
            int par=ar[0];
            if(!set.contains(par)){
                return map.get(par);
                
            }
        }
        return null;
    }
}