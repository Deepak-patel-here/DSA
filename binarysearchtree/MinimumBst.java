package binarysearchtree;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class MinimumBst {
    static int minValue(Node root) {
        if(root==null)return 0;
        if(root.left==null)return root.data;
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }
    public static void main(String[] args) {

    }
}
