package stack_practice;

public class CharStack {
    private CharNode top;
    int count=0;
    CharStack(){
         top=null;
         count++;
    }

    void push(char data_var){
        CharNode temp =new CharNode(data_var);
        temp=top;
    }
    char pop(){
        if(top==null){
            System.out.println("Stack underflow...");
        }
        CharNode temp=top;
        top=top.next;
        char data_var=temp.data;
        temp=null;
        return data_var;
    }
    boolean isEmpty(){
        return top==null;
    }
    int size(){
        return count;
    }
}
