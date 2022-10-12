package in.crepeat.jsedemopractice.ui;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<>();
	cars.add("volvo");
	cars.add("BMW");
	System.out.println(cars);
	
	cars.set(0, "tata");
	System.out.println(cars);

	}

}
