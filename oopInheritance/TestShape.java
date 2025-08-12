package com.rays.oopInheritance;


public class TestShape { public static void main(String[] args) {
	

System.out.println("---circle---");

	
	Circle c = new Circle();
	
	c.setColour("blue");
	c.setRadius(2);
	c.setBorderwidth(10);
	
	
	System.out.println("Colour:"+ c.getColour() );
	System.out.println("Radius:" + c.getRadius());
	System.out.println("Borderwidth:" + c.getBorderwidth());
	System.out.println("Area:"+ c.area());
	
	System.out.println("----------Rectangle-------------");

	
	Rectangle r = new Rectangle();
		
		r.setBorderwidth(10);
	    r.setColour("Red");
	    r.setLength(5);
	    r.setWidth(5);
	    
	    
	    System.out.println("Borderwidth:"+ r.getBorderwidth());
	    System.out.println("colour:"+ r.getColour());
	    System.out.println("Length:"+ r.getLength());
	    System.out.println("Width:"+ r.getWidth());
	    System.out.println("Area of rectangle:"+ r.area());
	    
	    System.out.println("-----------Triangle----------------");
	    
	    
	    Triangle t = new Triangle();
	    
	    t.setBase(50);
	    t.setBorderwidth(30);
	    t.setColour("Yellow");
	    t.setHeight(15);
	    
	    
	    
	    
	    System.out.println("Border:"+ t.getBorderwidth());
	    System.out.println("Base:"+ t.getBase());
	    System.out.println("colour:"+ t.getColour());
	    System.out.println("Height:"+ t.getHeight());
	    System.out.println("Area of triangle:"+ t.area());
	    
	    
	    
}
}
