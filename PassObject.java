
public class PassObject {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(10, 50);

		// display contents objects.
		System.out.println("Length:" + rect.getLength());
		System.out.println("Width: " + rect.getWidth());
		System.out.println("Area:" + rect.getArea());

		// pass the object to the changerectangle method.
		changeRectangle(rect);

		// Display objects contents again
		System.out.println();
		System.out.println("Length :" + rect.getLength());
		System.out.println("Width :" + rect.getWidth());
		System.out.println("Area :" + rect.getArea());

	}

	private static void changeRectangle(Rectangle r) {

		r.set(30, 5);
	}

}
