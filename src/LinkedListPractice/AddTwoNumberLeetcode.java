package LinkedListPractice;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data_var){
        this.data=data_var;
        this.next=null;
    }
}
public class AddTwoNumberLeetcode {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String numOne="";
        String numTwo="";
        ListNode tempOne=l1;
        ListNode tempTwo=l2;
        ListNode l3=null;
        while ((tempOne.next != null) || (tempTwo.next != null)) {
          if(tempOne.next != null)  {
                numOne += tempOne.data;
                tempOne=tempOne.next;
            }
            if(tempTwo.next != null){
                numTwo += tempTwo.data;
                tempTwo=tempTwo.next;
            }
        }
        int answerNum=reverseNo(reverseNo(Integer.parseInt(numOne)+ reverseNo(Integer.parseInt(numTwo))));
        while(answerNum != 0){
            int remainder=answerNum%10;
            answerNum/=10;
            l3=insertAtHead(l3,remainder);
        }
        return l3;
    }
    int reverseNo(int num){
        int revNo=0;
        while(num!=0){
            int remainder = num % 10;
            num = num / 10;
            revNo=revNo*10+remainder;
        }
        return revNo;
    }
    ListNode insertAtHead(ListNode l3, int data_var){
        ListNode newNode=new ListNode(data_var);
        if(l3==null){
            return newNode;
        }
        newNode.next=l3;
        return l3;
    }

}
