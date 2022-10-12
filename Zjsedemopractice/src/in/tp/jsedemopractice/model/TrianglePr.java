package in.tp.jsedemopractice.model;

public class TrianglePr {
	
	private int base;
	private int height;
	
	public TrianglePr() {
		this.base = 10;
		this.height = 8;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		return (.5*base*height);
	}

}
