package java_method.q09;

public class Even {

	public static boolean checkEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		int number = 10; // 一例
		boolean isEven = checkEven(number);

		if (isEven) {
			System.out.println(number + "は偶数です。");
		} else {
			System.out.println(number + "は奇数です。");
		}

	}

}
