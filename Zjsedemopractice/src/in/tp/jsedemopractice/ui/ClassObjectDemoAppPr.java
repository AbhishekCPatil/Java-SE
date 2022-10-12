package in.tp.jsedemopractice.ui;

import in.tp.jsedemopractice.model.CirclePr;
import in.tp.jsedemopractice.model.TrianglePr;

public class ClassObjectDemoAppPr {
	
	public static void main(String []args) {
		TrianglePr tri1 = new TrianglePr();
		System.out.println(tri1.getArea());
		
		TrianglePr tri2 = new TrianglePr();
		tri2.setBase(20);
		tri2.setHeight(10);
		System.out.println(tri2.getArea());
		
		System.out.println("\nBelow is CirclePr Constructor");
		CirclePr c1 = new CirclePr();
		System.out.println(c1.getArea());
		System.out.println(c1.getCircumference());
		
		System.out.println("\nBelow is CirclePr object");
		CirclePr c2 = new CirclePr();
		c2.setRadius(5);
		System.out.println(c2.getArea());
		System.out.println(c2.getCircumference());
		
	}

}
