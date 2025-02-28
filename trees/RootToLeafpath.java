package trees;

import java.util.ArrayList;

public class RootToLeafpath {
    public static void find(Node root, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> res){
        if(root==null) return;

        ans.add(root.data);
        if(root.left==null && root.right==null){
            res.add(new ArrayList<>(ans));
        }else{
            find(root.left,ans,res);
            find(root.right,ans,res);
        }

        ans.remove(ans.size()-1);

    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        find(root,ans,res);
        return res;
    }
    public static void main(String[] args) {

    }
}
