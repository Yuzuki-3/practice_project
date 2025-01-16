package java_method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static int getEvebNumbers(int[] numbers) {
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				count++;

			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 99 };
		int evenCount = getEvebNumbers(numbers);

		System.out.println(Arrays.toString(numbers) + "には、偶数が" + evenCount + "個あります。");

	}

}
