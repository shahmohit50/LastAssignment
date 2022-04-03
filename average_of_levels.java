public /**
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
       
   public List<Double> averageOfLevels(TreeNode root) {
     List<Double> res = new ArrayList<>();  
     Queue<TreeNode> que = new LinkedList<>();
       
     que.add(root);
     int val = 0,count =0;
     boolean flag = true;
     while(!que.isEmpty()){
         int size=que.size();
           double sum=0;
           for(int i=0;i<size;i++){
               TreeNode cur=que.remove();
               sum+=cur.val;
               if(cur.left!=null)
                   que.add(cur.left);
               if(cur.right!=null)
                   que.add(cur.right);
           }
           sum/=size;
           res.add(sum);
         
     }  
     return res;  
   }
}class average_of_levels {
    
}
