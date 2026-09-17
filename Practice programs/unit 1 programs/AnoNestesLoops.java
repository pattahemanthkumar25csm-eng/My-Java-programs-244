public class AnoNestesLoops {
   void nxt() {    // for loop inside while loop
        for ( int i = 1; i<=8;i++ ){
            System.out.println( " row is " + i);
            int j  =  1;
            while ( j <= 8) {
                System.out.println( " column is " + j);             
                 j++;
            }
        } 

    }


void team() {

int a = 1;
while (a <= 8) {
    System.out.println("horizontal line is " + a);
    a++;
    for(int b =1 ;b<=8;b++ )
        System.out.println(" vertical line is" + b);
        // while loop is inside for loop
}

} 


public static void main(String[] args) {
    AnoNestesLoops fw = new AnoNestesLoops();
    fw.nxt();
    fw.team();
}   
}




