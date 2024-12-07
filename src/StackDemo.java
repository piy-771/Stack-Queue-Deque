import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(78);
        stack.push(50);
        stack.push(20);
        stack.push(36);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        try {
            System.out.println(stack.pop());
        }catch (EmptyStackException stackException){
            System.out.println("You can't pop up from empty stack");
            System.out.println(stackException);
        }

        System.out.println(stack.empty());

    }
}
