class calc {
int add(int a, int b){
 return a+b;
}
int add(int a,int b,int c){
    return a+b+c;
}
}
// method over loading

public class Overload {
    public static void main(String[] args) {
        
calc mul = new calc();
 System.out.println(mul.add(2 , 4));
 System.out.println(mul.add(2 ,3,4));


    }
}
