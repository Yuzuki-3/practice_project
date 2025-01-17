package classSumple;

public class Test {

	public static void main(String[] args) {
		// インスタンス生成...クラスを実体化(具体化)させる構文
		// クラスは型にできる 参照型です
		Car car = new Car("日産", 200, "紫");
		Car car2 = new Car("トヨタ", 150, "赤");
		// セッターを呼び出して値をセット
		car.setMaker("日産");
		car.setSpeed(200);
		car.setColor("紫");
		car2.setMaker("TOYOTA");
		car2.setSpeed(150);
		car2.setColor("赤");
		// ゲッターの呼び出し
		System.out.println(car.getMaker());
		System.out.println(car.getSpeed());
		System.out.println(car.getColor());
		System.out.println(car2.getMaker());
		System.out.println(car2.getSpeed());
		System.out.println(car2.getColor());
		// 呼び出し
		car.showInfo();
		System.out.println("--------------------");
		car2.showInfo();
		System.out.println("--------------------");
		
		// electricCarクラスのインスタンス生成
		ElectricCar elCar = new ElectricCar("テスラ", 250, "シルバー", 100);
		elCar.showInfo();
	}

}
