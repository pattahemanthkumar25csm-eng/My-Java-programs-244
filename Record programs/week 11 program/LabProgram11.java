// we create program for exceptoon handling

import java.util.Scanner;

class LengthNotSufficientException extends Exception{
    LengthNotSufficientException(String msg){
        super(msg);
    }
}
// doing a program for mobilenumber valid or not by giving input
public class LabProgram11 {

 static void validmobilenumber(String number) throws LengthNotSufficientException{
    char[]digits = number.toCharArray();
    // mobilenumber length has 10 digits
    if(digits.length < 10){
        throw new LengthNotSufficientException("invalid mobile number");
    }

    if(digits.length > 10){
        char extra = digits[10];// will throw an exception called aioob
    }
  char[] tendigits = new char[10];
  for(int i = 0;i<10;i++){
    tendigits[i] = digits[i];
  }
  if(digits.length > 10){
    char forceException = tendigits[digits.length - 1];
  }
  long mobile = Long.parseLong(number);
  System.out.println("valid number");
}
public static void main(String[] args) {
    Scanner lp = new Scanner(System.in);
    System.out.println("enter the mobile number");
    String number = lp.nextLine();
try {
    validmobilenumber(number);
} catch (ArrayIndexOutOfBoundsException a) {
    // TODO: handle exception
    System.out.println("invslid mobile number");
}
catch(LengthNotSufficientException e){
    System.out.println(e.getMessage());
}
catch(NumberFormatException n){
    System.out.println("invalid mobile number");
}
finally{
    System.out.println("process completed");
    lp.close();
}
}    
}