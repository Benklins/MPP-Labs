package assignment3.problem3.inheritance;

    public class Circle extends Cylinder {

        private double radius;

        public Circle(double radius, double height) {

            super(radius, height);
            this.radius = radius;
        }


        public double computeArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    }
