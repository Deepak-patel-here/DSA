package trees;

public class childrenSumTree {

        public static boolean sum(Node root){
        if(root==null || (root.left==null && root.right==null) )return true;

        int left=(root.left!=null)?root.left.data:0;
        int right=(root.right!=null)?root.right.data:0;

        return (root.data==(left+right))&&sum(root.left)&&sum(root.right);


    }
        public static int isSumProperty(Node root){
        return sum(root)?1:0;
    }

    public static void main(String[] args) {

    }
}
