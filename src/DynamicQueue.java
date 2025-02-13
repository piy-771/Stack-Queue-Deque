public class DynamicQueue extends CircularQueue{
    public DynamicQueue(int size) {
        super(size);
    }

    public DynamicQueue() {
        super();
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){

            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i) % data.length];
            }
            front = 0;
            end = data.length;

            data = temp;
        }

        //at this point we know array is full
        //insert item
        return super.insert(item);
    }
}
