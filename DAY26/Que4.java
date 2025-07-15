package DAY26;
import java.util.ArrayList;

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
        int current = (root.val < max) ? root.val : -1;
            int leftSecond = secondLargest(root.left, max);
            int rightSecond = secondLargest(root.right, max);
            return Math.max(current, Math.max(leftSecond, rightSecond));
    }
    //solution:
    ArrayList<Integer> helper(BTNode root){
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) {
            arr.add(0);
            arr.add(0);
            return arr;
        }
        ArrayList<Integer> lst = helper(root.left);
        ArrayList<Integer> rst = helper(root.right);

        int sMaxi = 0;
        int maxi = Math.max(lst.get(0), lst.get(1));
        if(maxi == lst.get(0)){
            sMaxi = Math.max(lst.get(1), rst.get(0));
        }
        else{
            sMaxi  = Math.max(rst.get(1), lst.get(0));
        }
        if(maxi < root.val){
            sMaxi = maxi;
            maxi = root.val;
        }
        else if(sMaxi < root.val){
            sMaxi = root.val;
        }
        arr.add(maxi);
        arr.add(sMaxi);
        return arr;
    }

    public int secondLargestSol(BTNode root, int max){
        if(root == null) return -1;
        ArrayList<Integer> list = helper(root);
        return list.get(1);

    }

}
