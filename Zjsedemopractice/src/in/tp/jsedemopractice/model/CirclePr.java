package in.tp.jsedemopractice.model;

public class CirclePr {
	
	private static double PI = 3.14;
	
	private int radius;
	
	public CirclePr() {
		this.radius=10;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	
	public double getCircumference() {
		return 2*PI*radius;
	}
}
