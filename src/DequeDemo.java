import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(45);
//        deque.add(85);
//        deque.add(89);
//        System.out.println(deque);
//        deque.addFirst(98);
//        deque.add(100);
//        deque.addFirst(100);
//        System.out.println(deque);
//        deque.addLast(8956);
//        deque.addLast(102);
//        System.out.println(deque);
//        deque.remove();
//        System.out.println(deque);
//        System.out.println(deque.removeLast());
//        deque.push(45);
//        System.out.println(deque);
//        deque.removeLast();
//        System.out.println(deque);
//        System.out.println(deque.removeLast());
//        System.out.println(deque.pollLast());


        deque.addFirst(5);
        System.out.println(deque);
        deque.addFirst(10);
        System.out.println(deque);
        deque.add(6);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);


    }
}
