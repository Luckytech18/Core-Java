package com.rays.oop;

public class TestAutomobile {
	public static void main(String[] args) {
		
	
	
	Automobile car = new Automobile();
	
	
	car.setColour("Blue");
	car.setMake("mahindra");
	car.setSpeed(200);
	
	
	System.out.println("color;" + car.getColour());
	System.out.println("Make:" + car.getMake());
	System.out.println("No. of gears:" + Automobile.NO_OF_GEARS);
	
	
	car.accelerator();
	car.changeGear(3);
	car.accelerator();
	car.brake();
	
	System.out.println("Final speed:" + car.getSpeed() + "km/h");

}
}