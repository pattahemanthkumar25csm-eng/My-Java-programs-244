class Room {
   void loop (){
int i = 60;
for (i = 1;i <=20;i++){
    System.out.println("result is " +i );}
}
}
    class Tech{
        int i = 1;// methods are with parameters and without return value
void  cricket (int i) {
 while (i<= 50) {
    System.out.println(" hemanth  batting score is" + i);
    i++;
 }
}
}



public class Meth {
    public static void main(String[] args) {
        Room sg = new Room();
        sg.loop();
        Tech sr = new Tech();
        sr.cricket(34);        
    }
    
}
