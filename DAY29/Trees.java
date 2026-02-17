package DAY29;
import java.util.*;
class TreeNode{
    private static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
    
        }
    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of "+ node.data);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Your left digit of "+ node.data +" is:");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of "+ node.data);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Your right digit of "+node.data+" is:");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }


    }
            public void display(){
                display(root, " ");
            }
            private void display(Node node, String input){
                if(node == null){
                    return;
                }
                System.out.println(input + node.data);
                display(node.left, input+"\t");
                display(node.right, input+"\t");
            }
}
public class Trees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(sc);
        tree.display();
    }
}
            /*
class TreeNode{
    private class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
    }
}
    private Node root = null;
    public void add(Scanner sc){
        System.out.println("Enter the root value: ");
        int value = sc.nextInt();
        root = new Node(value);
        add(sc, root);
    }
    private void add(Scanner sc, Node node){
        System.out.println("Do you wish to enter left of " + node.value);
        boolean l = sc.nextBoolean();
        if(l){
            System.out.println("Enter the left of " + node.value);
            int lvalue = sc.nextInt();
            node.left = new Node(lvalue);
            add(sc, node.left);
        }
        System.out.println("Do you wish to enter right of " + node.value);
        boolean r = sc.nextBoolean();
        if(r){
            System.out.println("Enter the right of " + node.value);
            int rvalue = sc.nextInt();
            node.right = new Node(rvalue);
            add(sc, node.right);
        }

    }
    public void display(){
        display(root, " ");
    }
    private void display(Node node, String input){
        if(node == null){
            return;

        }
        System.out.println(input + node.value);
        display(node.left , input+"\t");
        display(node.right , input+"\t");

    }

}
*/