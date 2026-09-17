abstract class one{
   int a = 244;
   void yt(){
    System.out.println("this is the abstract concept");
   }
  abstract void ty();  // crete a abstract method then class is turn into abstract class
}
public class AbstractConcept extends one{
    @Override
    public void ty(){
        System.out.println(" this is part of abstract");
    }
    void ytt(){
        System.out.println(" hello abstract");
    }
public static void main(String[] args) {
    AbstractConcept ac = new AbstractConcept();
    System.out.println(ac.a);
    ac.yt();
    ac.ty();


}
    
}