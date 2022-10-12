package in.tp.jseprogpr.ui;

import in.tp.jseprogpr.model.Car;

public class CarApp {

	public static void main(String[] args) {
		Car c1 = new Car(); //Constructor
		Car c2= new Car();
		System.out.println("Final Price of "+c1.getModel()+" is Rs."+c1.getTotalPrice());
		
		c2.setBrand("Jeep");
		c2.setModel("Compass");
		c2.setPrice(2512345);
		System.out.println("Final Price of "+c2.getModel()+" is Rs."+c2.getTotalPrice());
		
		Car c3 = Car.add(c1, c2);
		System.out.println("Price of 2 cars is Rs."+ c3.getTotalPrice());

	}

}
