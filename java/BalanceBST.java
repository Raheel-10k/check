import java.util.ArrayList;
import java.util.List;

public class BalanceBST {
    int val;
    BalanceBST left;
    BalanceBST right;

    // Constructors
    BalanceBST() {}
    BalanceBST(int val) { this.val = val; }
    BalanceBST(int val, BalanceBST left, BalanceBST right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        List<Integer> val = new ArrayList<>();
        val.add(1);
        val.add(null);
        val.add(2);
        val.add(null);
        val.add(3);
        val.add(null);
        val.add(4);
        val.add(null);
        val.add(null);

    }
}


class Solution {
    private void inorderTraversal(BalanceBST root, List<Integer> values) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, values); 
        values.add(root.val);  
        inorderTraversal(root.right, values); 
    }

    private BalanceBST sortedArrayToBST(List<Integer> values, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        BalanceBST node = new BalanceBST(values.get(mid));  
        node.left = sortedArrayToBST(values, start, mid - 1); 
        node.right = sortedArrayToBST(values, mid + 1, end);  
        return node;
    }

    public BalanceBST balanceBST(BalanceBST root) {
        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);

        return sortedArrayToBST(values, 0, values.size() - 1);
    }
}
