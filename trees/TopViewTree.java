package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Pair{
    int key;
    Node node;

    Pair(int key,Node node){
        this.key=key;
        this.node=node;
    }
}

public class TopViewTree {
    public static ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        Queue<Pair> Q=new LinkedList<Pair>();

        Q.add(new Pair(0,root));
        while(!Q.isEmpty()){
            Pair it=Q.remove();
            int key=it.key;
            Node node=it.node;

            if(!mpp.containsKey(key))mpp.put(key,node.data);
            if(node.left!=null){
                Q.add(new Pair(key-1,node.left));
            }
            if(node.right!=null){
                Q.add(new Pair(key+1,node.right));
            }
        }

        for(int num:mpp.values()){

            ans.add(num);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
