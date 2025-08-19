package com.rays.oop.polyMorphism;

public class TestShapeByArray {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = new Triangle();
		s[1] = new circle();
		s[2] = new Rectangle();
		
		Triangle t = (Triangle) s[0];
		t.setBase(5);
		t.setHeight(10);
		
		circle c =(circle)s[1];
		c.setRadius(10);
		
		Rectangle r = (Rectangle) s[2];
		r.setLength(7);
		r.setWidht(8);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("Area:" + s[i].area());
			
		}
				

	}

}
