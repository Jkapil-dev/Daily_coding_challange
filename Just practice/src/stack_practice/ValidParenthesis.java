package stack_practice;

public class ValidParenthesis {

    static  boolean isValid(String parenthesis){
        CharStack s=new CharStack();
        for(char ch : parenthesis.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }else{
                if(s.isEmpty())return false;
                char s_top=s.pop();
                if(ch=='(' && s_top!=')'|| ch=='[' && s_top!=']'||ch=='{' && s_top!='}'){
                    return false;
                }

            }

        }
        return true;
    }
    public static void main(String[] args){
        String inputParenthesis="(){}[]";
        boolean answer=isValid(inputParenthesis);
        System.out.printf("Given parenthesis:  %s  is %b",inputParenthesis,answer);



    }
}
