package LinkedListPractice;

public class SinglyLLOperations {
    static class Node{
        int data;
        Node next;
        Node(){
            this.next=null;
        }
        Node(int data_var){
            this.data=data_var;
            this.next=null;
        }
    }
    static Node insertAtEnd(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    static void concatenateLL(Node lOne ,Node lTwo){
        if(lOne==null){
            lOne=lTwo;
            return;
        }

        if(lTwo==null) return;
        Node temp=lOne;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=lTwo;
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
        Node lOne=null;
        lOne=insertAtEnd(lOne,1);
        lOne=insertAtEnd(lOne,2);
        Node lTwo=null;
        lTwo=insertAtEnd(lTwo,3);
        lTwo=insertAtEnd(lTwo,4);

        concatenateLL(lOne,lTwo);
        printList(lOne);

    }
}
