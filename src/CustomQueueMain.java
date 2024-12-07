public class CustomQueueMain {
    public static void main(String[] args) throws  Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(34);
        queue.insert(89);
        queue.insert(14);
        queue.insert(521);
        queue.insert(478);

        queue.display();

        System.out.println(queue.remove());

        queue.display();



    }
}
