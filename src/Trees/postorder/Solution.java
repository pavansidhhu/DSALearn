package Trees.postorder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void PostOrder(Node root, List<Integer> l1){
        if(root==null){
            return;
        }
      PostOrder(root.left,l1);
      PostOrder(root.right,l1);
      l1.add(root.data);
    }
    public List<Integer> Postorder(Node root){
        List<Integer> l1=new ArrayList<>();
        PostOrder(root,l1);

        return l1;
    }
}
