package binarysearchtree;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
public class SearchInBst {
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null)return null;
        if(root.val==val)return root;
        if(root.val<val){
            TreeNode node=searchBST(root.right,val);
            return node;
        }else{
            TreeNode node=searchBST(root.left,val);
            return node;
        }
    }
    public static void main(String[] args) {

    }
}
