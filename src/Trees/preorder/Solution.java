package Trees.preorder;

import java.util.*;


class Solution {


    public void preorder(Node root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
    public List<Integer> preOrder(Node root) {

       List<Integer> arr = new ArrayList<>();

        preorder(root, arr);

        return arr;
    }
}
