package DAY26;
// given a binary tree. we need to tell what is the maximum path sum in the tree. from root to leaf node? 
import DAY25.BTNode;
public class QUE2 {
    public int maxPathSum(BTNode root){
        if(root == null)return 0;
        int leftSum = maxPathSum(root.left);
        int rightSum = maxPathSum(root.right);
        return root.val + Math.max(leftSum, rightSum);
    }
    
}
