package binarysearchtree;

import java.util.ArrayList;

public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        search(root,arr);
        int l=0,r=arr.size()-1;
        while(l<r){
            if((arr.get(l)+arr.get(r))==k)return true;
            else if((arr.get(l)+arr.get(r))>k)r--;
            else l++;
        }
        return false;

    }
    public void search(TreeNode root,ArrayList<Integer> arr){
        if(root==null)return;
        search(root.left,arr);
        arr.add(root.val);
        search(root.right,arr);
        return;

    }
    public static void main(String[] args) {

    }
}
