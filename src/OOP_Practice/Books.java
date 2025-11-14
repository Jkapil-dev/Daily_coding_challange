package OOP_Practice;
import java.util.Scanner;

public class Books {

    private String book_id ,book_name ,Author;
    private float price;

    public void getDetails(Scanner sc){
        System.out.println("Enter Book ID :");
        book_id= sc.next();
        System.out.println("Enter Book Name :");
        book_name=sc.next();
        System.out.println("Enter Author name :");
        Author= sc.next();
        System.out.println("Enter Book price :");
        price= sc.nextInt();
    }
    public void printDetails(){
        System.out.printf("%-10s %-25s %-20s %-10.2f%n",
                book_id, book_name, Author, price);
    }
    public float getPrice(){
        return price;
    }

}
class main{
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of books :");
        int noOfBooks=sc.nextInt();
        int totoal_price=0;

        Books[] book =new Books[noOfBooks];
        for (int i = 0; i < noOfBooks; i++) {
            System.out.println("---------------------------------------------------");
            System.out.printf("Enter details of %d no. book:",i+1);
            book[i] =new Books();
            book[i].getDetails(sc);
            totoal_price+=book[i].getPrice();
        }

        for (int i = 0; i < noOfBooks; i++) {
            System.out.println("---------------------------------------------------");
            System.out.printf("Details of %d no. book:",i+1);
            book[i].printDetails();
        }

        System.out.printf("Total price =%-10d",totoal_price);

    }

}
