package OOP_Practice;

public class Students {
    int roll_no;
    String name;
    int[] marks_of_subject=new int[5];
    float percentage;
    char grade;
    Students(String s_name,int roll_no,int sub_1,int sub_2,int sub_3,int sub_4,int sub_5){
        this.name=s_name;
        this.roll_no=roll_no;
        this.marks_of_subject[0]=sub_1;
        this.marks_of_subject[1]=sub_2;
        this.marks_of_subject[2]=sub_3;
        this.marks_of_subject[3]=sub_4;
        this.marks_of_subject[4]=sub_5;
        calc_percentage(marks_of_subject);
        assign_grade(percentage);
        display(roll_no,name,percentage,grade);
    }
    void calc_percentage(int[] marks_of_subject){
        float percentage=(marks_of_subject[0]+marks_of_subject[0]+marks_of_subject[0]+marks_of_subject[0]+marks_of_subject[0])/5F;
        this.percentage=percentage;
    }
    void assign_grade(float percentage){
        if(90<=percentage){
            this.grade='A';
        }else if(60<=percentage){
            this.grade='B';
        } else if (35<=percentage) {
            this.grade='C';
        } else{
            this.grade='F';
        }
    }
    void display(int roll_no, String name,float percentage ,char grade){
        System.out.printf("Name=%s ,Roll_no=%d ,Percentage= %f ,Grade= %c ",this.name,this.roll_no,this.percentage,this.grade);
    }
}
class student_details{
    public static void main(String[] args){
        Students s1=new Students("Naman",1,66,78,88,90,100);

    }
}
