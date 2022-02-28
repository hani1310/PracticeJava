
public class ArraySum {

	public static void main(String[] args) {
		// declare array and
		// initialize it with values
		int array[] = { 10, 20, 30, 80, 50 };

		// initialize sum variable with 0
		int sum = 0;

		// add array elements
		for (int i = 0; i < array.length; i++) {

		// sum = sum + array[i];
			sum += array[i];
		}

		// print the result of sum
		System.out.println("Sum of array elements= " + sum);

		// calculate average value
		double average = sum / array.length;

		// print the result of average of elements
		System.out.println("Average of array = " + average);
	}

}
