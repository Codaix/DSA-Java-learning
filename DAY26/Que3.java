package DAY26;
// two binary trees. one with root1 another with root2. we need to tell if they are identical or not and return true or false.
import DAY25.BTNode;
public class Que3 {
    public boolean isIdentical(BTNode root1, BTNode root2){
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;

        }
        boolean left = isIdentical(root1.left, root2.left);
        boolean right = isIdentical(root1.right, root2.right);
        return left && right;
    }
    
    
}
