class pan{
    private double result;
 private  double addnumbers(double a , double b){
    return a+b;
 }
private double  multiplynumbers(double a, double b){
    return a*b;
}
    private void logoperation(String operation){
        System.out.println(" the performed is "+ operation);

    }
public double add(double a , double b){
    logoperation("addition");
    result = addnumbers(a, b);
    return result;
}
public double multiply(double a , double b){
    logoperation("multiplication");
    result = multiplynumbers(a, b);
    return result;
}
}

public class Abstract {
    public static void main(String[] args) {
        System.out.println(" the result is " + new pan().add(10, 20));
        System.out.println(" the result is " + new pan().multiply(10, 20));
    }
}
