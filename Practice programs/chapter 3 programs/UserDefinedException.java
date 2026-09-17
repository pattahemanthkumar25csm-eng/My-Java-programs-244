public  class UserDefinedException  extends Exception{
   public  UserDefinedException(String name){
        super(name);
    }


public static void checkingage(int age) throws UserDefinedException {
    if(age < 18){
        throw new UserDefinedException("age is above 18 and you cannot eligible to vote");
}
System.out.println("you are eligilble to vote" + age);
}

public static void main(String[] args) {
    try{
        checkingage(19 );
    }
    catch(UserDefinedException u){
        System.out.println(" you are  not to be voted");
    }
}


}






