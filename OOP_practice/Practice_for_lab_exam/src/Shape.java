public  class Shape {
    protected int paramaterOne;
    protected int paramaterTwo;
    void inputValues(int parOne, int parTwo){
        this.paramaterOne=parOne;
        this.paramaterTwo=parTwo;
    }
     void calcArea(){};

     public static void main(String[] args){
      Triangle t1=new Triangle();
      t1.inputValues(3,4);
      t1.calcArea();
     }

}
class Triangle extends Shape{
    void calcArea(){
        System.out.println("Area of triangle :"+0.5*paramaterOne*paramaterTwo);
    }
}
class Rectangle extends Shape{
    void calcArea(){
        System.out.println("Area of Rectangle :"+paramaterOne*paramaterTwo);
    }
}
