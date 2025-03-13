package binarysearchtree;

import java.util.ArrayList;

class BSTIterator {
    TreeNode root;
    ArrayList<Integer> arr;
    int i=-1;
    public BSTIterator(TreeNode root) {
        this.root=root;
        arr=new ArrayList<>();
        search(root,arr);
    }
    public void search(TreeNode root,ArrayList<Integer> arr){
        if(root==null)return;
        search(root.left,arr);
        arr.add(root.val);
        search(root.right,arr);
        return;

    }

    public int next() {
        i++;
        int ans=arr.get(i);

        return ans;
    }

    public boolean hasNext() {
        int n=arr.size()-1;
        if((n-i)!=0)return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}

