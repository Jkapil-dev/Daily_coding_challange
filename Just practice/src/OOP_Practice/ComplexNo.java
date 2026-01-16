package OOP_Practice;

public class ComplexNo {
    float real;
    float imag;

    ComplexNo(float real , float imag){
        this.real=real;
        this.imag=imag;
    }
     public static void addition(ComplexNo num1 , ComplexNo num2){
        System.out.printf("sum=%.2f+%.2fi ",num1.real+num2.real,num1.imag+num2.imag);
    }
    public static void subtraction(ComplexNo num1 , ComplexNo num2){
        System.out.printf("sum=%.2f-%.2fi ",num1.real-num2.real,num1.imag-num2.imag);
    }
}
class Complex{
    public static void main(String[] args) {
        ComplexNo z1 = new ComplexNo(3,6);
        ComplexNo z2 =new ComplexNo(2,7);

        ComplexNo.addition(z1,z2);
        System.out.println();
        ComplexNo.subtraction(z1,z2);
    }

}
