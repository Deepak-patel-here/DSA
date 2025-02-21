import java.util.HashMap;

class LRUCache1 {
    class Node {
        Node prev, next;
        int key, value;
        Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    HashMap<Integer,Node> mpp=new HashMap<>();
    int capacity;

    public LRUCache1(int capacity) {
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
    }

    public int get(int key) {
        if(mpp.containsKey(key)){
            Node newNode=mpp.get(key);
            remove(newNode);
            insert(newNode);
            return newNode.value;
        }else return -1;
    }

    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            remove(mpp.get(key));
        }
        if(mpp.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }

    public void remove(Node node){
        mpp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node){
        mpp.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }
}
public class LRUCache {
    public static void main(String[] args) {

    }
}
