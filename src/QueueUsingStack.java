import java.util.EmptyStackException;
import java.util.Stack;
class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

     public void push(int x)  {
         stack1.push(x);
     }

    public int pop() throws Exception {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int popedItem = stack2.pop();

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return popedItem;
    }

    public int peek() throws Exception {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int peekedItem = stack2.peek();

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return peekedItem;


    }

    public boolean empty() {
        if (stack1.empty()) {
            return true;
        } else {
            return false;
        }
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {

    }
}
