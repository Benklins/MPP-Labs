package assignment3.problem3.composition;


public class Main {


    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(new Circle(10), 20);
        System.out.println(cylinder.computeVolume());
    }
}
