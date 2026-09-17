class f{
    int a =10;
    void sum(){
        System.out.println("sum is " + (a+34));
    }
}
class s{
    int b = 54;
    f add  = new f();
    void sub(){
        System.out.println( " subtraction is " + (b-10) );
    }

    void fun(){
        add.sum();
        System.out.println( add.a +" this can access the first class");
        System.out.println( " this is second class");
    }
}
public class ClassCall {

    public static void main(String[] args) {

        
        s sb = new s();
        sb.sub();
        sb.fun();


    }
}