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
import java.util.Queue;
import java.util.LinkedList;
import DAY25.BTNode;
import java.util.Scanner;

import DAY21.returnMid;
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
    public BTNode MakeQTree(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if( val == -1)return null;
        BTNode root = new BTNode(val);
        Queue<BTNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BTNode f = q.poll();
            System.out.println("Give the left and right child of "+f.val);
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l != -1){
                f.left = new BTNode(l);
                q.add(f.left);
            }
            if(r != -1){
                f.right = new BTNode(r);
                q.add(f.right);
            }

        }
        sc.close();
        return root;

    }
    void printBT(BTNode root){
        if(root == null) return;

        System.out.println("Node: " +  root.val);
        printBT(root.left);     
        if(root.left != null){
            System.out.println("Left child of " + root.val + " is " + root.left.val);
        } else {
            System.out.println("Left child of " + root.val + " is null");
        }
        printBT(root.right);
        if(root.right != null){
            System.out.println("Right child of " + root.val + " is " + root.right.val);
        } else {
            System.out.println("Right child of " + root.val + " is null");
        }
        return;
    }
    void printBQt(BTNode root){
        if(root == null) return;
        Queue<BTNode> q = new LinkedList<>();
        q.add(root);    
        while(!q.isEmpty()){
            int s = q.size();
            for(int i = 0; i<s; i++){
            BTNode f = q.poll();
            System.out.println("Node: " + f.val+"-");
            if(f.left != null){
                System.out.println(f.left.val+", ");
                q.add(f.left);
            }
            if(f.right != null){
                System.out.println(f.right.val+", ");
                q.add(f.right);
            }
            System.out.println();
        }
        }
        return;
    }
}
