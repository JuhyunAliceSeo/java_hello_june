package edu.global.prj.shape;

public class Circle extends Class {
	private double radius;
	
	public Circle(double rad){
		radius = rad;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
