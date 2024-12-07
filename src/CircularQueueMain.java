public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue circularQueue = new DynamicQueue(5);
        circularQueue.insert(56);
        circularQueue.insert(589);
        circularQueue.insert(5);
        circularQueue.insert(6);
        circularQueue.insert(86);
        circularQueue.insert(86);
        circularQueue.insert(86);

        circularQueue.display();
        System.out.println(circularQueue.remove());
       // System.out.println(circularQueue.insert(7892));
        circularQueue.display();



    }
}
