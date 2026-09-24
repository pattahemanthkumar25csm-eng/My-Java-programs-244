import java.util.Stack;
public class ListOfStacks {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(110);
        stack.push(120);
        stack.push(130);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
        stack.empty();
        System.out.println(stack);
        stack.search(1200);
        stack.search(130);
        System.out.println(stack.search(1200));
        System.out.println(stack.search(130));
    }
}
