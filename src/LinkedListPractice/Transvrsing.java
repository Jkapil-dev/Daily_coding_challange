package LinkedListPractice;

public class Transvrsing {
    static void iterativeApproach(Node head){
        Node current=head;
        while(head!=null){
            System.out.print(head.data);
        }
    }


    public static void main(String[] args){
        Node head= new Node(4);
        head.next=new Node(8);
        head.next.next =new Node(11);
        head.next.next.next =new Node(22);

    }
}
