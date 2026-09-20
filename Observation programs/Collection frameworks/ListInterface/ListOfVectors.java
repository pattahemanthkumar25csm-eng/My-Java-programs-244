import java.util.Vector;
public class ListOfVectors {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(110);
        vector.add(120);
        vector.add(130);
        System.out.println(vector);
        vector.addElement(140);
        vector.addElement(150);
        System.out.println(vector);
        vector.get(3);

        System.out.println(vector);
        vector.set(2, 130);
        System.out.println(vector);
        vector.remove(1);
        System.out.println(vector);
        vector.removeElement(130);
        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());
        System.out.println(vector.contains(140));
        System.out.println(vector.indexOf(140));
        System.out.println(vector.capacity());
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.toString());
        System.out.println(vector.equals(1234));
    }
}
