package com.rays.collection.sorting;



public class Marksheet{
	
	public int rollno;
	public String name;
	public int physics;
	public int maths;
	public int english;
	
	
	public Marksheet(int rollno , String name ,  int physics ,  int maths , int english) {
              this.rollno = rollno;
              this.name = name;
              this.physics = physics;
              this.maths = maths;
              this.english = english;
	
	}
	public String toString() {
		return "rollno:" + rollno + "name:" + name + "physics:" + physics + "maths:" + maths + "english:" + english;
	}

	

}
