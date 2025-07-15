package DAY27;
// given root of bt. and root of p and q 2 and 5 respect. we need to tell lowest common ansestor of p and q.
import DAY25.BTNode;
public class Que {
    public BTNode checkAnsestor(BTNode root, BTNode p, BTNode q){
        if(root == p || root == q){
            return root;
        }
        if(root == null){
            return null;
        }
        BTNode left = checkAnsestor(root.left, p, q);
        BTNode right = checkAnsestor(root.right, p, q);
        if(left != null && right != null){
            return root;
        }
        else if(left == null && right != null){
            return right;
        }
        else if(left != null && right == null){
            return left;
        }
        else{
        return null;
        }
    }   
    //for BST
    BTNode LCABST(BTNode root, BTNode p, BTNode q){
        if(root == null) return null;
        if(root.val > p.val && root.val > q.val){
            return LCABST(root.left, p, q);
        }
        else if(root.val < p.val && root.val < q.val){
            return LCABST(root.right, p, q);
        }
        else{
            return root;
        }
    } 
}
