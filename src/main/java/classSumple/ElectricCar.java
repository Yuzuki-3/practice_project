package classSumple;

public class ElectricCar extends Car {
	// 継承した場合には親クラスとの差分のみ記述する
	private int electricPower;

	// コンストラクタの定義
	public ElectricCar(String maker, int speed, String color, int electrickPower) {
		// 親クラスのコンストラクタを呼び出し
		// 親クラスのコンストラクタに初期値を任せる
		super(maker, speed, color);
		this.electricPower = electricPower;
	}

	// アクセッサの作成
	public int getElectricPower() {
		return electricPower;
	}

	public void setElectricPower(int electricPower) {
		this.electricPower = electricPower;
	}
	// methodのオーバーライド
	// 親クラスに定義してあるmethodと同じ名前、同じ戻り値、同じ引数
	// でメソッドを再定義すること
	// 同じメソッド名で処理の内容だけ変えたい時に使う

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("電力" + this.electricPower);
	}

}