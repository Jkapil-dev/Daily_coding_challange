package LinkedListPractice;

public class DoublyLL {
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
    static Node insertAtHead(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        newNode.prev=null;
        return newNode;
    }
    static Node insertAtEnd(Node head, int data){
        if (head == null){
            return insertAtHead(null,data);
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        Node newNode=new Node(data);
        temp.next=newNode;
        newNode.prev=temp;

        return head;
    }
    static Node insertAtAnyPos(Node head , int pos , int data){
        if(pos<0) System.out.print("Invalid Position");
        Node newNode=new Node(data);
        if(pos==0){
            newNode.next=head;
            if(head!=null){
                head.prev=null;
            }
        }
        Node temp=head;
        for (int i = 0; i < pos-1 && temp!=null ; i++) {
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of bound...");
            return head;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next==null){
            temp.next=newNode;

        }

        return head;
    }
    static void displayLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!= null){
                System.out.print("<->");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node listOne=null;
        System.out.print("Before any operation: ");
        displayLL(listOne);
        listOne=insertAtHead(listOne,10);
        System.out.println("By using insert at head: ");
        displayLL(listOne);
        listOne=insertAtEnd(listOne,30);
        System.out.println("By using insert at end: ");
        displayLL(listOne);
        listOne=insertAtAnyPos(listOne,2,20);
        System.out.println("By inserting at specific position: ");
        displayLL(listOne);


    }
}
