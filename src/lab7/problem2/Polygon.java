package lab7.problem2;

public interface Polygon extends ClosedCurve {

    double[] getSides();
    default double computePerimeter(){
        double[] sides = getSides();
        double perimeter = 0;
        for(double side : sides){
            perimeter += side;
        }
        return perimeter;
    }
}
