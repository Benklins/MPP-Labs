package assignment3.problem1;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Jones", new Job(150000));
        Person p2 = new Person("Jones", new Job(150000));
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }
}
