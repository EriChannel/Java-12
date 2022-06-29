import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(9);
        stack.push(0);
        System.out.println(stack);

        System.out.println("Phần tử đầu tiên " + stack.peek());
        System.out.println("Phần tử đầu tiên " + stack.pop());

        System.out.println(stack);
    }
}
