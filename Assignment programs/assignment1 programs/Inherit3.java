
class animal{
String name = " lion";
void ani(){
    System.out.println(" lion is the my fav animal");
}
}
class bird extends animal{
    String names = " parrot , sparrow";
    void bi(){
        System.out.println("parrot is my fav bird");// multi inheritanceis executed
    }
}
class sea extends animal {
    float marks = 99.23f;
    void mar(){
        System.out.println(" you got 1 st rank");
    }
}

public class Inherit3 {
    public static void main(String[] args) {
        sea as = new sea();
        /* 
System.out.println(as.name + " my fav animal");
System.out.println(as.names + "my fav bird");
System.out.println(as.marks + "i got this rank");*/


        as.mar();
        as.ani();
        as.ani();
    }
}
