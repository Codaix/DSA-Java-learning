package DAY26;

import DAY25.Tree;
import DAY25.BTNode;
import java.util.Queue;
import java.util.LinkedList;

// root is given. we need to return the height of the tree.
public class QUe {
    public int height(BTNode root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    public int heightIterative(BTNode root){
        if(root == null) return 0;
        int height = 0;
        Queue<BTNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            height++;
            for(int i = 0; i< size; i++){
                BTNode current = queue.poll();
                if(current.left != null){
                    queue.add(current.left);

                }
                if(current.right != null){
                    queue.add(current.right);
                }

            }

        }
        
        return height;
    }

    public static void main(String[] args) {
        Tree obj = new Tree();
        BTNode root = obj.MakeQTree();
        QUe queObj = new QUe();
        int height = queObj.height(root);
        System.out.println("Height of the tree is: "+ height);
    }    
}
