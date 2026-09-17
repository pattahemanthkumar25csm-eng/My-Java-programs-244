
import java.util.Scanner;
public class ExceptionHand4 {
    public static void division() throws ArithmeticException{
        int a = 29 ;
        int b ;
        System.out.println("entee the b vlaue");
        Scanner o = new Scanner(System.in);
       b=  o.nextInt();
        int c =a/b;
System.out.println("the value of c is " +c);
    }
    public static void main(String[] args) {
        try{
            division();
        }
        catch(ArithmeticException e){
            System.out.println("b value is greater than zero");
        }
        finally{
            System.out.println("the process is done");
        }
    }
}
