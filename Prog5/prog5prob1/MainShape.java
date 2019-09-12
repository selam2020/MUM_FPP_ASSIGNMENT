package prog5prob1;

public class MainShape {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(4.0, 2.0, "white");
		Rectangle r2 = new Rectangle(4.0, 3.0, "white");
		Square s1 = new Square(4, "Red");
		Square s2 = new Square(2, "yellow");
		Circle c1 = new Circle(2.0, "pink");

		Shape[] shapes = { r1, r2, s1, s2, c1 };
		printTotal(shapes);

	}

	public static void printTotal(Shape[] shapes) {
		double perimeterOfAllObjects = 0;
		for (Shape obj : shapes) {
			perimeterOfAllObjects = perimeterOfAllObjects + obj.calculatePerimeter();

		}
		System.out.println(perimeterOfAllObjects);

	}

}
