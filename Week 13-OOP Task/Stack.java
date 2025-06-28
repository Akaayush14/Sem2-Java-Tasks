
public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow!");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
