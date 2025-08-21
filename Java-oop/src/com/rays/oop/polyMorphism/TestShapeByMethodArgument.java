package com.rays.oop.polyMorphism;

public class TestShapeByMethodArgument {
	public static void main(String[] args) {
		
	
	Shape[] s = new Shape[3];
	
	s[0] = new Circle();
	s[1] = new Triangle();
	s[2] = new Rectangle();
	
	Circle c = (Circle)s[0];
	c.setRadius(5);
	
	Triangle t = (Triangle)s[1];
	t.setBase(7);
	t.setHeight(9);
	
	Rectangle r = (Rectangle)s[2];
	r.setLength(3);
	r.setWidht(5);
	
	double totalarea = ShapeMethodArgument.getArea(s);
	System.out.println("Total area:" + totalarea);
	

}
}