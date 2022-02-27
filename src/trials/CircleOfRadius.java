package trials;

public class CircleOfRadius {

	public double radius(double r) {
		
		double circum = 2*3.14*r;
		return circum;
	}
	public double area(double r) {
		double area = 3.14*r*r;
		return area;
	}
	public static void main(String[] args) {
		

		CircleOfRadius ra = new CircleOfRadius();
		double totalArea = ra.area(10);
		double totalcircum = ra.radius(5);
		System.out.println(totalcircum);
		System.out.println(totalArea);
	}

}
