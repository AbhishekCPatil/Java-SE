package in.tp.jsedemopractice.model;

public interface Shape {
	double getArea();
	double getPerimeter();
	
	default double estimatePaintingCost(double paintingRate) {
		return getArea()*paintingRate;
	}
}
