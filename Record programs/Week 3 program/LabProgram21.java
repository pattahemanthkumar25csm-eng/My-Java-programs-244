
public class LabProgram21 {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("usage: java marks <m1> <m2> <m3> <m4> <m5>");
           // return;
        }
double total = 0;
double[] marks = new double[5];
for (int i = 0 ; i< 5; i++){
    marks[i] = Double.parseDouble(args[i]);
    total += marks[i];
}
double average = total /5;

System.out.println("marks entered");

for(int i = 0 ; i < 5 ;i++){
    System.out.println("subject" + (i+1) + ":" + marks[i]);
}
System.out.println(" total is : " +total);
System.out.println("average is :" + average);




    }
}
