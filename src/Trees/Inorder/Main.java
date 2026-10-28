package Trees.Inorder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        Solution s1=new Solution();
        List<Integer> l1=s1.Inorder(root);
        l1.stream().forEach(e-> System.out.print(e+" "));


    }
}
