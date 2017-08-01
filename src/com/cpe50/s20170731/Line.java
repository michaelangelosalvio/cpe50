package com.cpe50.s20170731;


public class Line extends Point {
	private Point c2;
	

	public Line(int x, int y, Point c2) {
		super(x, y);
		this.c2 = c2;
	}

	public Point getC2() {
		return c2;
	}

	public void setC2(Point c2) {
		this.c2 = c2;
	}
	
	public double getDistance(){
		return Math.sqrt(Math.pow( super.getY() - c2.getY(), 2) + Math.pow( super.getX() - c2.getX(),2 ));
	}
	
	
}
