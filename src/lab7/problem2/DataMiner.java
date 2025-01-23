package lab7.problem2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();
	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(5,7));
		dm.objects.add(new Rectangle(2,9));
		dm.objects.add(new Circle(6));
		dm.objects.add(new EquilateralTriangle(5));
		dm.objects.add(new Ellipse(5,10));
		System.out.println(dm.computeAveragePerimeter());
	}
	

	public double computeAveragePerimeter() {
		if(objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
        for (ClosedCurve object : objects) {
            sum += object.computePerimeter();
        }
		return sum/objects.size();
	}

}
