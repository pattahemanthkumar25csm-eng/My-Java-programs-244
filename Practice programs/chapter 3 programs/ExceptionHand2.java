public class ExceptionHand2 {
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50};
        int i;
        String inputs[] = {"hemanth" ,"244" ,"csmd"};
        for(i = 0;i<inputs.length;i++)
try {
    int value = Integer.parseInt(inputs[i]);
    int res = numbers[i]/value;
    System.out.println("the result is" + res);
} catch (NumberFormatException e) {
    System.out.println("number format exception");
}
catch(ArithmeticException e){
    System.out.println("ae ");
}

catch(ArrayIndexOutOfBoundsException a){
    System.out.println("aioob");
}








    }
}
