package DAY27;
// we have bst and a value.. we need to insert tthis value and return the bst.
import DAY25.BTNode;
public class Que2 {
    public BTNode insertInBST(BTNode root, int val){
        if(root == null) return new BTNode(val);
        if(val<=root.val){
            root.left = insertInBST(root.left, val);
        }
        else if(val>root.val){
            root.right = insertInBST(root.right, val);
        }return root;
    }


    }
