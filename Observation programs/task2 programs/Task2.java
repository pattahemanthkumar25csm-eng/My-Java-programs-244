/*class book {
    int bookid;
    String  bookname;
    String author;
    double price;
    void display(){

        System.out.println("book id name"  +bookid);
        System.out.println("bookname is"  + bookname);
        System.out.println("book authoris " + author);
        System.out.println("the price of book is" + price);
    }
}
public class Task2 {
    public static void main(String[] args) {
book b = new book();
b.bookid = 244;
b.bookname = "java learns";
b.author = "james gosling";
b.price = 250.00;
book l = new book();
l.bookid = 28;
l.bookname = "learn";
l.author = " suresh";
l.price = 45.50;

b.display();
l.display();
    }
}
*/
/**
 * Task2 o fencapsulation
 */
class book{
   private int bookid;
  private  String  bookname;
   private String author;
  private  double price;
 public book( int id , String name , String author , double price){
    this.bookid = id;
    this.bookname = name;
    this.author = author;
    this.price = price;
 }
void setbookid(int id ){
    bookid = id;
}
void setbookname(String name){
    bookname = name;
}
void setauthor(String author ){
   this.author = author;
}
void setprice(double price){
    this.price = price;
}
int getbookid(){
    return bookid;
}
String getbookname(){
    return bookname;
}
String getauthor(){
    return author;
}
double getprice(){
    return price;
}
}
public class Task2 {
public static void main(String[] args) {
    book c = new book(244, "java", "james", 350.50);
    System.out.println("book id is"+ c.getbookid());
    System.out.println("book name is"+c.getbookname());
    System.out.println("author is "+ c.getauthor());
    System.out.println("price is "+c.getprice());

}
    
}




















