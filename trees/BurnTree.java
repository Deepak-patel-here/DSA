package trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BurnTree {
    public static void markParent(Node root, HashMap<Node, Node> mpp) {
        Queue<Node> Q = new LinkedList<>();
        if (root == null) return;
        Q.offer(root);
        while (!Q.isEmpty()) {
            Node node = Q.poll();
            if (node.left != null) {
                mpp.put(node.left, node);
                Q.offer(node.left);
            }
            if (node.right != null) {
                mpp.put(node.right, node);
                Q.offer(node.right);
            }
        }
    }

    public static Node targetFinder(Node root, int target) {
        if (root == null) return null;
        if (root.data == target) return root;

        Node leftResult = targetFinder(root.left, target);
        if (leftResult != null) return leftResult;

        return targetFinder(root.right, target);
    }


    public static int minTime(Node root, int target) {
        HashMap<Node, Node> mpp = new HashMap<>();
        markParent(root, mpp);

        Node t = targetFinder(root, target);
        if (t == null) return 0;


        HashMap<Node, Boolean> visited = new HashMap<>();
        Queue<Node> Q = new LinkedList<>();
        Q.offer(t);
        visited.put(t, true);
        int time = 0;

        while (!Q.isEmpty()) {
            int n = Q.size();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                Node node = Q.poll();

                if (node.left != null && !visited.containsKey(node.left)) {
                    cnt = 1;
                    visited.put(node.left, true);
                    Q.offer(node.left);
                }
                if (node.right != null && !visited.containsKey(node.right)) {
                    cnt = 1;
                    visited.put(node.right, true);
                    Q.offer(node.right);
                }
                Node parent = mpp.get(node);
                if (parent != null && !visited.containsKey(parent)) {
                    cnt = 1;
                    visited.put(parent, true);
                    Q.offer(parent);
                }
            }
            if (cnt == 1) time++;
        }
        return time;
    }
    public static void main(String[] args) {

    }
}
