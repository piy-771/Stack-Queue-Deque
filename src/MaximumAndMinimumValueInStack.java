import java.util.Arrays;
import java.util.Stack;

public class MaximumAndMinimumValueInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(45);
        stack.add(89);
        stack.add(14);
        stack.add(100);
        stack.add(23);
        System.out.println(stack);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (!stack.empty()){
            max = Integer.max(max,stack.peek());
            min = Integer.min(min,stack.peek());
            stack.pop();
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
