package lab5.prob2;

public class Duck implements QuackBehaviour, FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }

    @Override
    public void quack() {
        System.out.println("Quack by squeaking");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void display() {
        System.out.println("Displaying");
    }
}
