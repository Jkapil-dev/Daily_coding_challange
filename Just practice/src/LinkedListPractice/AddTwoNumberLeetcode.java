package LinkedListPractice;



class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


public class AddTwoNumberLeetcode {
    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        int remainder=0;
        ListNode tempOne=l1;
        ListNode tempTwo=l2;
        ListNode answer=null;
        while(tempTwo!=null || tempOne !=null| carry != 0){
            int valueOne=(tempOne !=null) ?tempOne.val :0;
            int valueTwo=(tempTwo !=null) ?tempTwo.val :0;
            sum=valueOne+valueTwo+carry;
            remainder=sum%10;
            carry=sum/10;
            answer=insertAtEnd(answer,remainder);

           if(tempOne!=null) tempOne=tempOne.next;
           if(tempTwo!=null) tempTwo=tempTwo.next;
        }
        return answer;
    }
    static ListNode insertAtEnd(ListNode head, int data_var) {
        ListNode newnode=new ListNode(data_var,null);
        if(head==null){
            return newnode;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumberLeetcode sol = new AddTwoNumberLeetcode();
        ListNode result = sol.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
