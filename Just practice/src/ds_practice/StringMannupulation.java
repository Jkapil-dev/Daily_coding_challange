package ds_practice;
import java.util.Arrays;
import java.util.Scanner;

public class StringMannupulation {

    static int calcLen(char[] strArray){
        int len=0;
        while(len< strArray.length)len++;
        return len;
    }
    static void copyStr(char[] str){
        char[] copiedStr=new char[str.length];
        for (int i = 0; i < str.length; i++) {
            copiedStr[i]=str[i];
        }
        System.out.println("Given string :"+new String(str)+"\nCopied string :"+new String(copiedStr));
    }
    static void reverseStr(char[] str){
        char[] revStr = new char[str.length];
        int j=0;
        for (int i = str.length-1; i >=0; i--) {
            revStr[j]=str[i];
            j++;
        }
        System.out.println("Given string: "+new String(str)+"\nReversed string: "+new String(revStr));
    }
    static void concatnteStr(char[] strOne , char[] strTwo){
        char[] concStr=new char[strOne.length + strTwo.length];
        int index = 0;
        for (char c : strOne) concStr[index++] = c;
        for (char c : strTwo) concStr[index++] = c;
        System.out.println("Concatenated string : " + new String(concStr));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String:");
        String strOne= sc.next();
        System.out.println("Enter Second String:");
        String strTwo= sc.next();

        char[] str1=strOne.toCharArray();
        char[] str2=strTwo.toCharArray();

        int strOneLen=calcLen(str1);
        int strTwoLen=calcLen(str2);
        System.out.println("Length of str1: "+strOneLen);
        System.out.println("Length of str2: "+strTwoLen);
        copyStr(str1);
        copyStr(str2);
        reverseStr(str1);
        reverseStr(str2);
        concatnteStr(str1,str2);

    }
}