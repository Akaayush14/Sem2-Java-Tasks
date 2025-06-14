
abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle can fly high.");
    }
}

class Penguin extends Bird {
    void fly() {
        System.out.println("Penguin cannot fly.");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        eagle.fly();
        penguin.fly();
    }
}