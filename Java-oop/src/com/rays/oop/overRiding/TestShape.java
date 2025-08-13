package com.rays.oop.overRiding;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("---------circle------");

		Shape s = new Rectangle();

		Rectangle r = (Rectangle) s;

		s.setBorderwidth(10);
		s.setColour("red");
		r.setLength(7);
		r.setBreadth(5);

		System.out.println("Border Width:" + s.getBorderwidth() + "\n" + "Colour:" + s.getColour() + "\n" + "Length"
				+ r.getLength() + "\n" + "Breadth" + r.getBreadth() + "\n" + s.area());

		System.out.println("---------circle-------");

		Shape s1 = new Circle();
		Circle c = (Circle) s1;

		s1.setBorderwidth(15);
		s1.setColour("blue");
		c.setRadius(2);

		System.out.println("borderwidth:" + s1.getBorderwidth());
		System.out.println("Colour:" + s1.getColour());
		System.out.println("Radius" + c.getRadius());
		System.out.println("Area of circle:" + s1.area());

		System.out.println("--------Triangle----");

		Shape s2 = new Triangle();

		Triangle t = (Triangle) s2;
        s2.setBorderwidth(2);
        s2.setColour("yellow");
        t.setBase(8);
        t.setHeight(9);
        
        System.out.println("Borderwidth:"+ s2.getBorderwidth());
        System.out.println("Colour:" + s2.getColour());
        System.out.println("base:"+ t.getBase());
        System.out.println("Height:"+ t.getHeight());
        System.out.println("Area of Triangle" + s2.area());
	}

}
