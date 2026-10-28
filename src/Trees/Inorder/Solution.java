package Trees.Inorder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public void InOrder(Node root, List<Integer> l1){
    if(root==null) {
        return;
    }
    InOrder(root.left,l1);
    l1.add(root.data);
    InOrder(root.right,l1);
}
public List<Integer> Inorder(Node root){
    List<Integer> l1=new ArrayList<>();
    InOrder(root,l1);
    return l1;
}
}
