/*class rom{
    int a =10;
    rom(){
        int b = 20;
        System.out.println("result is " + (a+b));
    }
    void ram (){
        System.out.println("the result is correct");
    }
}

class rock extends rom{
int c =99;
rock (){
    int d= 1;
    System.err.println(" value is" + this.c);
    System.out.println(" addition is  "+(c+d));
}
void sum (){
    int x = 23, y = 32;
    System.out.println(" sum is"+ (x+y));
}

void display(){
    System.out.println(" the result is "+ super.a);

}
}

public class SuperKey {
    public static void main(String[] args) {
        rock ss = new rock();
        ss.display();
ss.ram();
ss.sum();

    }
}*/
/**
 * SuperKey
 */


class person{
    String name;
    person (String name){
        this.name = name;
        System.out.println(" person name is ");
    }
    void show(){
        System.out.println(" name is" + name);
    }
}

class roll extends person{
    int rollno;
    roll( String name , int rollno){
        super(name);
        this.rollno = rollno;
        System.out.println("the roll number is");
    }
    void dis (){
        super.show();
        System.out.println(" roll number " + rollno);
    }
}
public class SuperKey {
public static void main(String[] args) {
 roll std = new roll("hemanth", 244);
 std.dis();
    


}
    
}