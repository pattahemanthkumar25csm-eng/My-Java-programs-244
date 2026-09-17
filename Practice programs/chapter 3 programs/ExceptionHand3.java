public class ExceptionHand3 {
    public static void check(int age) {
        if(age < 18)
            throw new ArithmeticException("you cannot eligilble to vote");

        System.out.println("you are eligilble to vote and you age is" +age);
    }
public static void main(String[] args) {
    try {
        check(19);
    } catch (ArithmeticException e) {
        // TODO: handle exception
      System.out.println("it is used keyword is throw");
      System.out.println("error" + e.getMessage());
    }
    finally{
        System.out.println("the process is done");
    }
}
}
