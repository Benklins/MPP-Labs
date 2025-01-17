package assignment3.problem3.inheritance;

public class Main {




    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10.0, 10);
        Circle circle = new Circle(10.0, 10);
        System.out.println(circle.computeVolume());
        System.out.println(cylinder.computeVolume());


    }
}
