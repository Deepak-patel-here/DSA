package trees;

import java.util.LinkedList;
import java.util.Queue;

 class Codec {
    public String serialize(TreeNode root) {
        if(root==null)return "";

        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        StringBuilder str=new StringBuilder();
        while(!Q.isEmpty()){
            TreeNode node=Q.poll();
            if(node==null){
                str.append("N ");
            }
            else{
                str.append(node.val).append(" ");
                Q.offer(node.left);
                Q.offer(node.right);
            }
        }
        System.out.println(str.toString().trim());
        return str.toString().trim();

    }


    public TreeNode deserialize(String data) {
        if(data==null || data.length()==0 )return null;
        String[] value=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(value[0]));
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);

        int i=1;
        while(!Q.isEmpty()  && i<value.length){
            TreeNode node=Q.poll();

            if(!value[i].equals("N")){
                node.left=new TreeNode(Integer.parseInt(value[i]));
                Q.offer(node.left);
            }
            i++;
            if(i>=value.length)break;

            if(!value[i].equals("N")){
                node.right=new TreeNode(Integer.parseInt(value[i]));
                Q.offer(node.right);
            }
            i++;
        }
        return root;


    }
}
public class SerializeAndDeserialize {
    public static void main(String[] args) {

    }
}
