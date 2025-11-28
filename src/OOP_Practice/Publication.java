package OOP_Practice;
//Identify commonalities and differences between Publication, Book and Magazine classes.
//Title, Price, Copies are common instance variables and saleCopy is a common method.
// The differences are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty,
// Current issue, receiveissue().Write a program to find how many copies of the given books are ordered and
// display total sale of publication.

public class Publication {
    String title;
    int price;
    int copies;

    void saleCopies(){
        System.out.println("Sale of publication :"+(copies*price));
    }

}
class Book extends Publication{
    String author;
    void orderCopies(int copieNo){
        copies+=copieNo;
        System.out.println(copieNo+" copies of Book Ordered.");
    }
}
class Magzines extends Publication{
    String issueDate;
    void orderQty(int noOfOrder){
        copies+=noOfOrder;
    }
    void reveiveIssue(String issueD){
        issueDate=issueD;
        System.out.println("Received new issue: "+issueDate);
    }
}
class Main{
    
}