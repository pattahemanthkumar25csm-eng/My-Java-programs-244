// method over riding with abstraction
class house{
void room(){
}
void hall(){
    int things;

}
}
class kitchen extends house{
void room(){
    int members = 4;
    System.out.println("members are" + members);
}
@Override
void hall()
{
String things ;
System.out.println(" the things are 4");
System.out.println("things are" + " sofa" + "chairs" );
}


void bath(){
    String thing ;
    System.out.println("thing is " + " soap" + " " + " buckets");
}
}
public class DataAbstract {
    public static void main(String[] args) {
        kitchen kit = new kitchen();
        kit.hall();
        kit.room();
        kit.bath();
        
    }
}
