package in.tp.jseprogpr.ui;

import in.tp.jseprogpr.model.Rectangle;

public class RectDemoApp {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.setLength(10);
		r1.setBreadth(5);
		System.out.println(r1.getArea());
		
		r2.setLength(20);
		r2.setBreadth(5);
		System.out.println(r2.getArea());

	}

}
