//Identify commonalities and differences between Publication, Book and Magazine classes.
// Title, Price, Copies are common instance variables and saleCopy is a common method.
// The differences are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty,
// Current issue, receiveissue().Write a program to find how many copies of the given books are ordered
// and display total sale of publication.
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class Publication {
    Scanner sc=new Scanner(System.in);
    protected   String title;
    protected int price;
    protected int copies=0;
    public Publication(String t,int p){
            this.title=t;
            this.price=p;
    }
    public void saleCopy(int quantity){
        copies+=quantity;
    }
    public int totalSell(){
        return copies*price;
    }
    public static void main(String[] args){
        Book BookOne=new Book("Journey to the west.",300,"ABC");
        BookOne.orderCopies(50);
        System.out.println("Book autor:"+BookOne.author);
        int totalsell=BookOne.totalSell();
        System.out.println("Sale till now:"+totalsell);

        Magzine MagOne=new Magzine("Weekly Updates",500,"CDE");
        MagOne.orderQty(100);
        totalsell= MagOne.totalSell();
        System.out.println("Sale till now:"+totalsell);
    }
}
class Book extends Publication{

     String author;
    public Book(String t, int p,String a){
        super(t,p);
        this.author=a;
    }

    void orderCopies(int orderOfcopies){
       saleCopy(orderOfcopies);
        System.out.printf("%d copies of Book : %s  sold \n",this.price,this.title);
    }

}
class Magzine extends Publication{

    String currentissue;
    public Magzine(String t, int p,String issue){
        super(t,p);
        this.currentissue=issue;
    }

    void receiveIssue(String issue){
        currentissue=issue;
        System.out.println("User issued book on:"+currentissue);
    }
    void orderQty(int qty){
        saleCopy(qty);
        System.out.printf("%d copies of Magzine : %s  sold \n",this.price,this.title);
    }
}
