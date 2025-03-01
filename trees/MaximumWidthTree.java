package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthTree {
    public static int widthOfBinaryTree(TreeNode root) {
        int maxWidth=0;
        if(root==null)return maxWidth;

        Queue<Pair> Q=new LinkedList<>();
        Q.offer(new Pair(0,root));
        while(!Q.isEmpty()){
            int n=Q.size();
            int key1=Q.peek().key;
            int first=0,last=0;
            for(int i=0;i<n;i++){
                int id=Q.peek().key-key1;
                TreeNode node=Q.peek().node;
                Q.poll();
                if(i==0)first=id;
                if(i==n-1)last=id;

                if(node.left!=null)Q.offer(new Pair(id*2+1,node.left));
                if(node.right!=null)Q.offer(new Pair(id*2+2,node.right));

            }
            maxWidth=Math.max(maxWidth,last-first+1);


        }
        return maxWidth;


    }
    public static void main(String[] args) {

    }
}
