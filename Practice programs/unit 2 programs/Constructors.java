public class Constructors {
    int number ;
    String name ;
    float marks;
public Constructors(){
    this.number = 244;
this.name = " hemanth";
this.marks = 88.92f;
}
void sample(){
    System.out.println("roll number is " + number);
    System.out.println(" name is" + name);
    System.out.println(" marks are" + marks);
}
    public static void main(String[] args){
Constructors kumar = new Constructors();
kumar.sample();
    }
    }

