package java_method.q07;

public class SumNumbers2 {

	public static int calculateSum(int integer, double realNum) {
		return (int) (integer + realNum);
	}

	public static void main(String[] args) {
		int integer = 5;
		double realNum = 3.3;

		int result = calculateSum(integer, realNum);

		System.out.println("第一引数（整数）：" + integer);
		System.out.println("第二引数（実数）：" + realNum);
		System.out.println("加算結果：" + result);

	}

}
