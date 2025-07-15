package DAY27;
// a person is standing at the left of the BT and we need to get the vlues that he can see from his sight in the BT
import DAY25.BTNode;
import java.util.ArrayList;
public class Que3 {
    int height(BTNode root){
        if(root == null)return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public ArrayList<BTNode> sightValues(BTNode root, int level, ArrayList<BTNode> result){
        int height = height(root);
        for(int i = 1; i <= height; i++){  
            sightValuesUtil(root, i, level, result);
        }
        return result;
    }

    private void sightValuesUtil(BTNode node, int level, int maxLevel, ArrayList<BTNode> result) {
        if (node == null) return;
        if (level > maxLevel) {
            result.add(node);
            maxLevel = level;
        }
        sightValuesUtil(node.left, level + 1, maxLevel, result);
        sightValuesUtil(node.right, level + 1, maxLevel, result);
    }
    
}
