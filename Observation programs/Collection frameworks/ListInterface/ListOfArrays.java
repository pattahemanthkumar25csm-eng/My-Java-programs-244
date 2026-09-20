    import java.util.ArrayList;

class ListOfArrays {
    public static void main (String[] args) {
        
      	// Creating an ArrayList
      	ArrayList<Integer> a = new ArrayList<>();
      	
      	// Adding Element in ArrayList
      	a.add(1);
      	a.add(2);
      	a.add(3);
      	System.out.println(a);

        // Adding element at specific index
        a.add(3,10);
        a.add(4,20);
        a.add(5,50);
      	System.out.println(a);
        System.out.println(a.size());

        ArrayList<Integer> b = new ArrayList<>();
      b.add(40);
      b.add(50);
      b.add(2,30);
      b.add(3,40);
      b.add(4,60);
      	System.out.println(b);

      // Getting element at specific index
    b.get(4);
      System.out.println(b);
      b.add(60);
      b.add(80);
      System.out.println(b.size());
      // Setting element at specific index
b.set(3, 50);
b.remove(1);
      	// Printing ArrayList
      	//System.out.println(a);
      	System.out.println(b);
        ArrayList<String> s = new ArrayList<>();
        s.add("Hello hemmanth");
        System.out.println(s);
s.contains("Hello");
        System.out.println(s);
       // s.contains("1234");
        System.out.println(s.contains("1234"));
       // s.size();
        System.out.println(s.size());
        // s.isEmpty(); to check whether the list is empty or not
        System.out.println(s.isEmpty());
       // System.out.println(s.clear());
       s.clear();
        System.out.println(s);
    //  s.lastIndexOf(s);
      System.out.println(s.lastIndexOf(s));
    }
}
