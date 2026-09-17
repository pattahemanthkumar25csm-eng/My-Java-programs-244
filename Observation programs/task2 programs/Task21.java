/*class person{
    String name;
    int age;
    void getperson(String name , int age){
        this.name = name;
        this.age = age;
    }
}

class student extends person{
    int rollno;
    void getstudent(int rollno){
        this.rollno = rollno;
    }
    void show(){
        System.out.println("---student details---");
        System.out.println("name is " + name);
        System.out.println("age is"+ age);
        System.out.println("rollno is" + rollno);

    }
}
class faculty extends person{
    String subject;
    void getfaculty(String subject){
        this.subject = subject;
    }

void show(){
System.out.println("--- faculty details---");
System.out.println("name of faculty is"+ name);
System.out.println(" age of " +age);
System.out.println("subject is " + subject);
}
}
public class Task21 {
    public static void main(String[] args) {
        student s= new student();
        s.getperson("hemanth", 19);
        s.getstudent(244);
        faculty f= new faculty();
        f.getperson("srinu", 35);
        f.getfaculty("programming");
s.show();
f.show();

    }
}
*/


/**
 * Task21 of another program
 */























public class Task21 {
static class Area{
double area (double radius){
    return 3.14*radius*radius;
}
int area(int length ,int breadth){
    return length*breadth;
}
double area(double b, double h){
    return 0.5*b*h;
}

}
public static void main(String[] args) {
Area a = new Area();
System.out.println("area of circle "+ a.area(5));
System.out.println("area of rectangle"+a.area(10,5));
System.out.println("area of triangle" + a.area(3,5));
}
    
}