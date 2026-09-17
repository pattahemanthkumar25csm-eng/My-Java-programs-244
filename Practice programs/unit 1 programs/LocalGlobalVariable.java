

    
 public class LocalGlobalVariable{ 
 int a = 10;// class variable
 void  bag(){          // methods are without parameters and return value
    int b  = 20; //method variable
    System.out.println("addition is " + (a+b));
 }


int subtract(int a,int b, int c){    // methods are with parameters and with return value
return a+b+c;
}

    public static void main(String[] args) {

        LocalGlobalVariable obj = new  LocalGlobalVariable();
        obj.bag();
        int result = obj.subtract(9, 19, 290);
        System.out.println(result);
    }
    
}
