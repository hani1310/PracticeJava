import java.util.Iterator;

public class ArrayFirst {

	public static void main(String[] args) {
		// Initialize and array of size 20 and print all elements using for loop
		int num[] = new int[10];// instantiation of array

		num[0] = 5;// initialization
		num[1] = 10;
		num[2] = 15;
		num[3] = 20;
		num[4] = 25;
		num[5] = 30;
		num[6] = 35;
		num[7] = 40;
		num[8] = 45;
		num[9] = 50;
		// Array loops
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);

		}
	}

}