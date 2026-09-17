
/*
this 5 th type of inheritance is called multiple inheritance 

*/

//we create twointefaces called first and second
// in first interface having a intialised variable and abstract method 
interface first{
    int a =244;
    void system();
}
// in secind interface have an initialised variable and abstract method called part
interface second{
    int y = 300;
    void part();
}
// to inherit the interfaCes by using implements keyword
public class MultipleInherit implements first , second {
    // to override the methods
 @Override
public void system(){
    System.out.println("the multiple inheritance value is" + a);
 }
@Override
 public void part(){
    System.out.println("the second interface of value is " + y);
}
    public static void main(String[] args) {
       // we create an object for class
        MultipleInherit mi = new MultipleInherit();
        // we call methods in main method
        mi.system();
        mi.part();



    }
}
