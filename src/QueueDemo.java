import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(45);
        queue.add(78);
        queue.add(36);
        queue.add(98);
        queue.add(10);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();





//        System.out.println(queue.peek());
//        System.out.println(queue.size());
//        System.out.println(queue.remove());
//        System.out.println(queue.size());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());



    }
}
