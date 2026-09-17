
class f{
    int a =10;
    void sum(){
        System.out.println("sum is " + (a+34)); // single inheritance is executed
    }
}
class s extends f{
    int b = 54;
    f add  = new f();
    void sub(){
        System.out.println( " subtraction is " + (b-10) );
    }

}
public class Inherit1 {
    public static void main(String[] args) {

        s oc = new s();
        System.out.println(" variable can access is" + (oc.a) );
        System.out.println(" can access" + (oc.b));
        oc.sum();
        oc.sub();
        
    }
}
