package com.company;

class Point {
	private final int x;
	private final int y;
    public Point(int startX, int startY) {
    	x = startX;
    	y = startY;
    }

    double distTo(Point p2) {
	    return Math.sqrt(Math.pow(x - p2.x, 2) + Math.pow(y - p2.y, 2));
    }
}

public class Main {
    public static void main(String[] args) {
	    Point p1 = new Point(3, 4);
	    Point p2 = new Point(0, 0);
	    System.out.println(p1.distTo(p2));
    }
}
