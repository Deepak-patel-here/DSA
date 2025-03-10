package binarysearchtree;

public class CeilBST {
    public static int findCeil(Node root, int key) {

        int ceil=-1;
        while(root!=null){
            if(root.data==key)return root.data;
            if(root.data>key){
                ceil=root.data;
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return ceil;

    }

    public static void main(String[] args) {

    }
}
