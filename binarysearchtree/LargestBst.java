package binarysearchtree;

public class LargestBst {
    public static boolean helper(Node root,long min,long max){
        if(root==null)return true;
        if(root.data<=min || root.data>=max)return false;

        return helper(root.left,min,root.data) && helper(root.right,root.data,max);
    }
    static int largestBst(Node root)
    {
        if(root==null)return 0;

        if(helper(root,Long.MIN_VALUE,Long.MAX_VALUE)){
            return count(root);
        }
        return Math.max(largestBst(root.left),largestBst(root.right));
    }

    public static int count(Node root){
        if(root==null)return 0;

        return 1+count(root.left)+count(root.right);
    }

    public static void main(String[] args) {

    }
}
