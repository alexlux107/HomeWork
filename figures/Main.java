package figures;

public class Main {

	public static void main(String[] args) {

		Triangle triOne = new Triangle(new Point(2, 2), new Point(4, 5), new Point(8, 1));
		System.out.println(triOne);
		
		System.out.println();
		
		Rectangle rectOne = new Rectangle(new Point(1, 6), new Point(6, 6), new Point(1, 2), new Point(6, 2));
		System.out.println(rectOne);
	}

}
