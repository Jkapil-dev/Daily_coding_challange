class Node{
    int val;
    Node next;

    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}
public class ReverseLinkedList {
   static public Node reverseList(Node head) {
        Node prev=null;
        Node current=head;
        while(current!=null){
            Node tempNext=current.next;
            current.next=prev;

            prev=current;
            current=tempNext;
        }
        return head;


    }

public static void main(String[] args){
    Node head=new Node(5);
    head.next=new Node(10);
    head.next.next=new Node(20);
    head.next.next.next=new Node(30);
}
}