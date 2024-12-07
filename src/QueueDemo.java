import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());



    }
}