package LinkedListPrac;

public  class doubllyLinkedList {
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data, Node prev, Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }

        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public static Node delHead(Node head){
        if(head==null || head.next==null)return null;
        Node temp=head;
        temp=temp.next;
        temp.prev=null;
        return temp;
    }
    public static Node delTail(Node head){
        if(head==null || head.next==null)return null;
        Node temp=head;
        while(true){
            if(temp.next.next==null){
                temp.next.prev=null;
                temp.next=null;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static Node delPos(Node head,int k){


        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                break;
            }
            temp=temp.next;
        }
        Node back=temp.prev;
        Node front=temp.next;
        if(back==null && front==null)return null;
        else if (back==null) {
            return delHead(head);
        }else if(front==null){
            return delTail(head);
        }
            back.next=front;
            front.prev=back;
            temp.prev=null;
            temp.next=null;

        return head;
    }
    public static Node arr2DLL(int[]arr){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node temp1=new Node(arr[i],temp,null);
            temp.next=temp1;
            temp=temp1;
        }
        return head;

    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        Node head=arr2DLL(arr);
        printLL(delHead(head));
        printLL(delTail(head));
        printLL(delPos(head,1));


    }
}
