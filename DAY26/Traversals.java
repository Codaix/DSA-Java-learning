package DAY26;
// three types inorder, preorder and postorder traversals
// inorder: left, root, right
// preorder: root, left, right
// postorder: left, right, root

import DAY25.BTNode;
public class Traversals {
    // Inorder Traversal left -> root -> right
    public void inorder(BTNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Preorder Traversal Root -> left -> right
    public void preorder(BTNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal left -> right -> root
    public void postorder(BTNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    
}
