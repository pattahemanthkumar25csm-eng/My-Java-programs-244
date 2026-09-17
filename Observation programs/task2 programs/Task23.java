abstract class shape{
    abstract void draw();
}

class circle extends shape{
    @Override
    public void draw(){
        System.out.println("the drawing is circle");
    }
}

class rectangle extends shape{
    @Override
    public void draw(){
        System.out.println("th edrawing is rectangle");
    }
}


interface printable{
    void ward();
}
class report implements printable{
    @Override
   public void ward(){
        System.out.println("the interface is implenents");
    }
}

public class Task23 {
    public static void main(String[] args) {
        report r = new report();
        r.ward();

 circle a = new circle() ;
a.draw();
rectangle t = new rectangle();
t.draw();
    





    }
}
