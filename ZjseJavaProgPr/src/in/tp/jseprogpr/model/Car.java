package in.tp.jseprogpr.model;

public class Car {
	
	private static double gst = 0.18; //gst is 18%, written simplified
	
	private String brand;
	private String model;
	private int price;
	
	public Car() {
		this.brand = "Volvo";
		this.model = "XC60";
		this.price = 6012345; //price in INR
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public long getTotalPrice() {
		long finalPrice = (long) (gst*price)+price;
		
		return finalPrice;
	}
	
	public static Car add(Car a, Car b) {
		Car c = new Car();
		c.price = a.price + b.price;
		
		return c;
	}
	
}
