package LinkedListPractice;

public class Node {
    int data;
    Node next;
    Node(){}
    Node(int data_var){
        this.data=data_var;
        this.next=null;
    }
    Node(int data_var, Node next_pos){
        this.data=data_var;
        this.next=next_pos;
    }
}
