// without encapping 
/* 
class bag{
    int marks;
}

public class Encapping {
    public static void main(String[] args) {
        bag b = new bag();
        b.marks = 98;
        System.out.println("marks is " + b.marks);
        
    }
}
*/

// with encapping



class bag{
   private int marks;
    private int age = 18;
   void set(){
    marks = 99;
    age  = 18;
 }
 int get(){
    return marks + age;
 }
}
 class plank extends bag { // encapping with inheritance
    String book = "phk";
   private void book() {
        System.out.println(" this book called is phk");
    }
    
void sets (){
     book = " phk ";
}
String gets(){
    return book;
}

 }
 
public class Encapping {
    public static void main(String[] args) {
        bag b = new bag();
        b.set(); 
System.out.println(b.get()) ;   
plank p = new plank();
p.sets();
System.out.println(p.gets());

    }
}