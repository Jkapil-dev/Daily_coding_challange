public class Complex {
    int real;
    int imag;
    Complex(int r,int i){
        this.imag=i;
        this.real=r;
    }

    static void addComplex(Complex zOne,Complex zTwo){
        int rSum= zOne.real+ zTwo.real;
        int iSum=zOne.imag +zTwo.imag;
        System.out.printf("(%d + %di) + (%d + %di) = %d + %di ",zOne.real,zOne.imag,zTwo.real,zTwo.imag,rSum,iSum);
        System.out.println();
    }
    static void subComplex(Complex zOne,Complex zTwo){
        int rSub= zOne.real - zTwo.real;
        int iSub=zOne.imag  -zTwo.imag;
        System.out.printf("(%d + %di) - (%d + %di) = %d + %di ",zOne.real,zOne.imag,zTwo.real,zTwo.imag,rSub,iSub);
        System.out.println();

    }
    static void multiplyComplex(Complex zOne, Complex zTwo){
        int firstTerm=zOne.real*zTwo.real - zOne.imag*zTwo.imag;
        int secondTerm=zOne.real*zTwo.imag + zOne.imag*zTwo.real;
        System.out.printf("(%d + %di) * (%d + %di) = %d + %di ",zOne.real,zOne.imag,zTwo.real,zTwo.imag,firstTerm,secondTerm);
        System.out.println();

    }
    static void dividComplex(Complex zOne, Complex zTwo){
        int firstTerm=(zOne.real*zTwo.real + zOne.imag*zTwo.imag)/zTwo.real*zTwo.real+zTwo.imag+zTwo.imag;
        int secondTerm=(zOne.real*zTwo.imag - zOne.imag*zTwo.real)/zTwo.real*zTwo.real+zTwo.imag+zTwo.imag;
        System.out.printf("(%d + %di) / (%d + %di) = %d + %di ",zOne.real,zOne.imag,zTwo.real,zTwo.imag,firstTerm,secondTerm);
        System.out.println();

    }
    public static void main(String[] args){
        Complex z1=new Complex(1,2);
        Complex z2=new Complex(3,4);
        System.out.println("Addition of complex no:");
        addComplex(z1,z2);
        System.out.println("Subtraction of complex no:");
        subComplex(z1,z2);
        System.out.println("Multiplication of complex no:");
        multiplyComplex(z1,z2);
        System.out.println("Division of complex no:");
        dividComplex(z1,z2);
    }
}
