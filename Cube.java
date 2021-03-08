//JAVA PROGRAM TO FIND AREA AND VOLUME OF CUBE


import java.util.Scanner;

class Cuboid {
	private double length, breadth, height;
	
	public Cuboid(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public double getVolume() {
		return length * breadth * height;
	}
	
	public double getSurfaceArea() {
		return 2 * (length * breadth + breadth * height + length * height);
	}
	
	public void printVolume() {
		System.out.println("Volume of the cuboid is : " + this.getVolume());
	}
	
	public void printSurfaceArea() {
		System.out.println("Surface area of the cuboid is : " + this.getSurfaceArea());
	}
}

    public class Cube{
	        public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		
		    System.out.print("Enter length, breadth, and height: ");
		    double l = s.nextDouble(), b = s.nextDouble(), h = s.nextDouble();
		    Cuboid c = new Cuboid(l, b, h);
		
		    c.printVolume();
		    c.printSurfaceArea();
	    }
}