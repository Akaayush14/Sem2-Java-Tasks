
import java.util.Scanner;

public class CallCenterQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public CallCenterQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCall(String caller) {
        if (size == capacity) {
            System.out.println("Call queue is full.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = caller;
        size++;
    }

    public void serveCall() {
        if (size == 0) {
            System.out.println("No calls to serve.");
            return;
        }
        System.out.println("Handling call from: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
    }

    public void displayCalls() {
        if (size == 0) {
            System.out.println("No pending calls.");
            return;
        }
        System.out.print("Current Calls: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public void pendingCalls() {
        System.out.println("Pending calls: " + size);
    }

    public static void main(String[] args) {
        CallCenterQueue callQueue = new CallCenterQueue(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Call\n2. Serve Call\n3. Display Calls\n4. Pending Calls\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter caller ID or name: ");
                    String caller = scanner.nextLine();
                    callQueue.addCall(caller);
                    break;
                case 2:
                    callQueue.serveCall();
                    break;
                case 3:
                    callQueue.displayCalls();
                    break;
                case 4:
                    callQueue.pendingCalls();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
