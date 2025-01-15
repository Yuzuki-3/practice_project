package sample;

public class MethoSample {

	public static void main(String[] args) {
		test();
		int result = plusNum(2,5);
		System.out.println(result);
	}
	// メソッドの定義
	// アクセス修飾子　戻り値の型　メソッド名(必要であれば引数)
	// 戻り値無しの場合は戻り値の型はvoid
	public static void test() {
		System.out.println("Hello");
	}
	public static int plusNum(int num1, int num2) {
		return num1 + num2;
	}

}
