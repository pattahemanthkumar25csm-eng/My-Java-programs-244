public class NestedLoops {
    // nested for loop 
  void nested(){
    for(int i = 1 ;i<=9; i++){
        for(int j = 1;j<=6 ;j++){
            System.out.println("value of i is" + i + j  );}
        }
}
void loop(){
int a = 1;
while( a <= 3){
    int  b= 1;
while (b <= 3) {
    System.out.println( "nested loops are dones");
    b++;
}
}
}
public static void main(String[] args) {
    NestedLoops lp = new NestedLoops();
    lp.nested();    // nested for loop calling
  // lp.loop();              // nested while loop calling
}








}



    


















