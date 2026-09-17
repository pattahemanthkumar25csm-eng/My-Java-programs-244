class men{
int cal(int a,int b , int c){
    int result = a+b+c/3;
return result;
}
}
class nem extends men{
    @Override
    int cal (int a,int b,int c){
        int result = a-b-c/3;

        return result;
    }
    void show(){
int result = cal(10, 9, 8);
System.out.println(" the result is" + result);
    }
}
class emn extends nem{
    int cal (int a,int b,int c){
        int result = a*b*c/3;
        return result;
    }
    void show(){
        int result = cal(20, 19, 18);
        System.out.println(" the result is " + result);

    }
}

public class Poly {
    public static void main(String[] args) {
        
men ne = new men();
int result = ne.cal(10, 9, 8);
System.out.println(" the result is " + result);

        nem me = new nem();        
        me.show();

       emn em = new emn();
        em.show();



    }
}
