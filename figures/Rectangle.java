package figures;

public class Rectangle extends Shape {

	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rectangle() {
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

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	double calculatePerimetr() {
		if ((a.length(b) != c.length(d) || a.length(c) != b.length(d))) {
			System.out.println("It is not a Rectangle");
			return 0;
		} else {
			return a.length(b) + a.length(c) + c.length(d) + b.length(d);
		}
	}

	@Override
	double calculateArea() {
		if ((a.length(b) != c.length(d) || a.length(c) != b.length(d))) {
			return 0.0;
		} else {
			return a.length(b) * a.length(c);
		}
	}

	@Override
	public String toString() {
		return "Rectangle\nPerimetr = " + calculatePerimetr() + "\nArea = " + calculateArea();
	}

}
