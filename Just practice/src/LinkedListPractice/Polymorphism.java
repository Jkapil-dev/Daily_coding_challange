package LinkedListPractice;

public class Polymorphism {

    static class Node{
        int coff;
        int pow;
        Node next;

        Node(int c,int p){
            coff=c;
            pow=p;
            next=null;
        }
    }

    static Node insertTerm(Node head, int coff, int pow){
        Node newNode = new Node(coff,pow);
        if(head == null){
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }

    static Node addPolynomials(Node p1 , Node p2){
        Node result = null;
        Node tail=null;

        while(p1 != null && p2!=null){//this loops calculates the values of resulting answer
            int c,p;
            if(p1.pow==p2.pow){
                c=p1.coff+p2.coff;
                p=p1.pow;
                p1=p1.next;
                p2=p2.next;
            } else if (p1.pow>p2.pow){
                c=p1.coff;
                p=p1.pow;
                p1=p1.next;
            }else{
                c=p2.coff;
                p=p2.pow;
                p2=p2.next;
            }
            Node newNode=new Node(c,p);
            //assigning new node to result
            if(result==null){
                result=newNode;
                tail=newNode;
            }else {
                tail.next = newNode;
                tail = tail.next;
            }

        }
        while(p1!=null){
            Node newNode =new Node(p1.coff,p1.pow);
            if(result==null){
                result=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=tail.next;
            }
            p1=p1.next;
        }
        while(p2 !=null){
            Node newNode =new Node(p2.coff,p2.pow);
            if(result==null){
                result=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=tail.next;
            }
            p2=p2.next;
        }
        return result;
    }
    static void printPolynomial(Node head){
        if(head==null){
            System.out.println("0");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.coff+"x^"+temp.pow);
            if(temp.next != null && temp.next.pow>=0){
                System.out.print(" + ");
            } else if (temp.next != null) {
                System.out.print(" ");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node polyOne=null;
        polyOne = insertTerm(polyOne,3,3);
        polyOne = insertTerm(polyOne,4,2);
        polyOne=insertTerm(polyOne,1,0);

        Node polyTwo=null;
        polyTwo=insertTerm(polyTwo,4,3);
        polyTwo=insertTerm(polyTwo,2,1);
        polyTwo=insertTerm(polyTwo,1,0);

        System.out.print("Expression 1: ");
        printPolynomial(polyOne);
        System.out.print("Expression 2: ");
        printPolynomial(polyTwo);
        Node sum= addPolynomials(polyOne,polyTwo);
        System.out.print("P1 + P2 :");
        printPolynomial(sum);
    }

}