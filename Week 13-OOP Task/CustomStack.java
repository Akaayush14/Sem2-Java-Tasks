
public class CustomStack {
    private int[] data;
    private int top;
    private int capacity;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }
        data[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
