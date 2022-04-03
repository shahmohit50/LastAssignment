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

import java.util.*;
class Solution {
    public ArrayList<Integer> arr1 = new ArrayList<>();
    public ArrayList<Integer> arr2 = new ArrayList<>();
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leafAdd(root1);
        for(Integer i : arr2){
            arr1.add(i);
        }
        arr2.clear();
        leafAdd(root2);
        
        return arr2.equals(arr1);
    }

    
    public void leafAdd(TreeNode roo){
        if(roo == null){
            return;
        }  
        if(roo.left == null && roo.right == null){
            arr2.add(roo.val);
            return;
        }
        leafAdd(roo.left);
        leafAdd(roo.right);
    }
}