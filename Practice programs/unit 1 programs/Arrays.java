public class Arrays {
    public static void main(String[] args) {
       int a [] = {10,20,30,40,50};
        System.out.println(a[2]);
        System.out.println(a[4]);

  // one dimensions arrays
  int marks [] = {74,67,99,96,88};
  for  (int i = 0 ;i< marks.length ; i++)
    {
        System.out.println(marks[i]);
    }  
// for each loop of static array
 /*int  a [] = { 12,23,34,45,56,67};
for (int b : a ){
    System.out.println(b);
}*/

// dyanamic array
int sum []  = new int [5];
{
    for (int rv : sum){
 System.out.println( rv);
}
}

for (int i =1; i <= 5 ; i++)
{
    for (int j=1;j <= i ; j++)
    {
        System.out.println("*");

 
    }
    System.out.println();
}
























}


}