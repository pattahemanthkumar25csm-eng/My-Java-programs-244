public class ExceptionHand1 {
    public static void main(String[] args) {
        int a = 99 , b = 0;
         try{  int c  = a/b;
           System.out.println("the value of c is" + c);
         }
         catch(ArithmeticException ae){
            System.out.println("the denominator is always greater than zero");
         }
         finally{
            System.out.println("process is done");
         }
            int s[] = { 10,20,30,40,50};
            try{
            System.out.println(s[6]);
            System.out.println("the index position is out of  bound");
            }
             catch(ArrayIndexOutOfBoundsException ai){
                System.out.println("the array mentioned position with in the array");
             }
             finally{
            System.out.println("process is done");
         }
           System.out.println(" this exception handling program");
           System.err.println("this is first program");
    }
}
