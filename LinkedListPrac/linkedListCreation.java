package LinkedListPrac;

public class linkedListCreation {
    public  static node convertArray(int[]arr){
        node head=new node(arr[0]);
        node move=head;
        for(int i=1;i<arr.length;i++){
            node temp=new node(arr[i]);
            move.next=temp;
            move=temp;
        }
        return head;
    }
    public static int len(node head){
        int cnt=0;
        node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[]arr={2,6,9,6};
        node a=convertArray(arr);
        node temp=a;
//        while(true){
//            if(temp.next==null){
//                System.out.print(temp.data);
//                break;
//            }
//            System.out.print(temp.data+",");
//            temp=temp.next;
//        }
        System.out.println("length of LL = "+len(a));


    }

}
