package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewTree {
    public ArrayList<Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)return ans;

        Queue<Pair> Q=new LinkedList<Pair>();
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        Q.add(new Pair(0,root));

        while(!Q.isEmpty()){
            Pair p=Q.remove();
            int key1=p.key;
            Node node=p.node;

            mpp.put(key1, node.data);

            if(node.left!=null)Q.add(new Pair(key1-1,node.left));
            if(node.right!=null)Q.add(new Pair(key1+1,node.right));
        }

        for(int num:mpp.values()){
            ans.add(num);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
