package OOP_Practice;

public class Student {
    int roll_no;
    String name;
    Student(int s_rollno ,String s_name){
        this.roll_no=s_rollno;
        this.name=s_name;
    }


    public static void main(String[] args){
        Student rohan=new Student(1,"Rohan");
        System.out.println("Name :"+rohan.name+", Roll no. :"+rohan.roll_no);
    }
}
