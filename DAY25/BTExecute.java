package DAY25;

public class BTExecute {
    public static void main(String[] args) {
        Tree obj = new Tree();
        BTNode root = obj.MakeTree();
        obj.printBT(root);
    }
}
