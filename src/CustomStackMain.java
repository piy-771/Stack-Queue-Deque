public class CustomStackMain {
    public static void main(String[] args) throws CustomStackException {
        CustomStack stack = new DynamicStack();

        stack.push(34);
        stack.push(35);
        stack.push(389);
        stack.push(35);
        stack.push(0);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
