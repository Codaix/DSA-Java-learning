package DAY26;
// we have a binary tree root. we need to return the second largest value in that.
import DAY25.BTNode;
public class Que4 {
    public int maximum(BTNode root){
        if(root == null) return Integer.MIN_VALUE;
        int max = root.val;
        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);
        max = Math.max(max, Math.max(leftMax, rightMax));
        return max;
    }
    public int secondLargest(BTNode root, int max){
        if(root == null) return -1;
        if(root.val != max){
            int leftSecond = secondLargest(root.left, max);
            int rightSecond = secondLargest(root.right, max);
            return Math.max(leftSecond, rightSecond);
        }
        return -1;
    }
    
}
