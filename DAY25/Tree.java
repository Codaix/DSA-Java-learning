package DAY25;
// tree is a non-linear data structure. 

// types:
// 1. generic tree: each node has any number of child.
// 2. binary tree: each node has at most two children.
// 3. binary search tree: left child is less than parent and right child is greater than parent.
// 4. avl tree: a self balancing binary search tree.

// we will impliment using arraylist.
// using recursion
// base case: check if -1. if yes then the user don't wanna input anything else.
// if no then recursive call
// ask recursion to input the left subtree and return the root of left subtree.
// and same for right subtree.
// then attach the root of left subtree with the root and root of right subtree to the root.
import java.util.ArrayList;
import DAY25.BTNode;
import java.util.Scanner;
public class Tree {
    public BTNode MakeTree() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
        if( val == -1)return null;
        BTNode root = new BTNode(val);
        System.out.println("Enter left child of " + val + ": ");
        root.left = MakeTree();
        System.out.println("Enter right child of " + val + ": ");
        root.right = MakeTree();
        return root;
    }
}
