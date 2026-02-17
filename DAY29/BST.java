package DAY29;
class BSTTech{

    public class Node{
        private int value;
        private int height;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
        public int getVal(){
            return value;
        }
    }
    private Node root;
    public BSTTech(){

    }
    public int height(Node node){
        if(node==null){
            return-1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int value){
        root = insert(value, root);
    }
    /* important */
    private Node insert(int value, Node node){
        if(node == null ){
            node = new Node(value);
            return node;
        }
        if(value <= node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void display(){
        display(root, "Root Node: ");
    }
    public void display(Node node, String input){
        if(node == null){
            return;
        }
        System.out.println(input+node.getVal());
        display(node.left, "left child of "+ node.getVal() + " : ");
        display(node.right, "right child of "+ node.getVal() + " : ");
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right))<=1&& balanced(node.left)&& balanced(node.right);
    }
    public void populate(int[] nums){
        for(int i =0 ;i<nums.length; i++){
            this.insert(nums[i]);
        }
    }
    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length);
    }
    private void populatedSorted(int[] nums, int start, int end){
        if(start>= end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);
    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.println("\t"+node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.println("\t"+node.value+" ");
        inorder(node.right);
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println("\t"+node.value+" ");
    }
}

public class BST{
    public static void main(String[] args) {
        BSTTech tree = new BSTTech();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
        System.out.println("\nPreOrder:");
        tree.preorder();
        System.out.println("\nInOrder:");
        tree.inorder();
        System.out.println("\nPostOrder:");
        tree.postorder();

    }
}
