package figures;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double calculatePerimetr() {
		if ((a.length(b) > b.length(c) + c.length(a)) 
				|| (b.length(c) > a.length(b) + c.length(a))
				|| (c.length(a) > a.length(b) + b.length(c))) {
			System.out.println("It is not a Triangle");
			return 0;
		} else {
			return a.length(b) + b.length(c) + c.length(a);
		}
	}

	@Override
	double calculateArea() {
		if ((a.length(b) > b.length(c) + c.length(a)) 
				|| (b.length(c) > a.length(b) + c.length(a))
				|| (c.length(a) > a.length(b) + b.length(c))) {
			return 0;
		} else {
			double halfP = (a.length(b) + b.length(c) + c.length(a)) / 2;
			return Math.sqrt(halfP * (halfP - a.length(b)) * (halfP - b.length(c)) * (halfP - c.length(a)));
		}
	}

	@Override
	public String toString() {
		return "Triangle\nPerimetr = " + calculatePerimetr() + "\nArea = " + calculateArea();
	}

}
