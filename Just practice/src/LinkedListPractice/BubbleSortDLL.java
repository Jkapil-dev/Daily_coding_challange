package LinkedListPractice;

public class BubbleSortDLL {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    static  Node insertAtSpecificPos(Node head,int pos,int data){
        if(pos<0 || (head==null&&pos>0)){
            System.out.println("Invalid position: ");
            return head;
        }
        Node newNode=new Node(data);

        if(pos==0){
            newNode.next=head;
            if(head != null){
                head.prev=newNode;
            }
            return newNode;
        }
        Node temp=head;
        for(int i=0;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of bound....");
            return head;
        }
        newNode.next= temp.next;
        newNode.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;

        return head;
    }
    static void bubbleSortLL(Node head) {
        if (head == null) return;
        Node curr;
        boolean swapped;
        do {
            swapped = false;
            curr = head;
            while (curr.next != null){
                if (curr.data > curr.next.data) {

                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;

                    swapped = true;
                }
                curr = curr.next;
            }

        }while (swapped) ;
    }
    static public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=null;
        head=insertAtSpecificPos(head,0,2);
        head=insertAtSpecificPos(head,1,204);
        head=insertAtSpecificPos(head,2,22);
        head=insertAtSpecificPos(head,3,3);

        printList(head);
        bubbleSortLL(head);
        printList(head);

    }
}
