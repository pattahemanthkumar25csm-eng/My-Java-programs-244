// program for methiid overrifding
import java.util.Scanner;

class rbi{
    protected double interestrate  = 4.0;// interset rate for rbi guig=de lines
  double getinterestrate(){
    return interestrate;
  }
void rate(){
    System.out.println("rbi interest rate is" + getinterestrate() + "%");
}
}
class sbi extends rbi{
    @Override
    double getinterestrate(){
        return 7.0;
    }
}
class icici extends rbi{
    @Override
    double getinterestrate(){
        return 8.3;
}
}
class pnb extends rbi{
    @Override
        double getinterestrate(){
        return 6.6;
}
}
public class LabProgram7 {
public static void main(String[] args) {
    
Scanner bi = new Scanner(System.in);
System.out.println("enter the bank name to find the interest");
String bankname = bi.nextLine();
rbi bank;
//rbi is inerited and overriden the of variables
switch (bankname.toUpperCase()) {
    case "rbi":
        bank = new rbi();
        break;
     case "sbi" :
        bank = new sbi();
        break;
        case "icici":
            bank = new icici();
            break;
            case "pnb" :
                bank = new pnb();
    default:
        System.out.println("bank not found");
        bi.close();
        return;
}
bank.rate();
bi.close();
}
}
