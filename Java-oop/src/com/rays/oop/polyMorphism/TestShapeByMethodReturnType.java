package com.rays.oop.polyMorphism;

public class TestShapeByMethodReturnType {
	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1); // new Circle();
		s[1] = Shape.getShape(2); // new Triangle();
		s[2] = Shape.getShape(3); // new Rectangle();

		Circle c = (Circle) s[0];
		c.setRadius(3);

		Triangle t = (Triangle) s[1];
		t.setBase(2);
		t.setHeight(4);

		Rectangle r = (Rectangle) s[2];
		r.setLength(5);
		r.setWidht(6);

		for (int i = 0; i < s.length; i++) {

			System.out.println("Area:" + s[i].area());
		}

	}

}
