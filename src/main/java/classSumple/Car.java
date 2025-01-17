package classSumple;

public class Car {

	// フィールド...クラスの状態を示すもの
	// privateをつけてフィールドを"カプセル化"する
	private String maker;
	private int speed;
	private String color;

	// コンストラクタ...インスタンス生成に最初に呼び出されるメソッド
	// コンストラクタ名はクラスと同じにする
	public Car(String maker, int speed, String color) {
		this.maker = maker;
		this.speed = speed;
		this.color = color;
	}

	// アクセッサ...フィールドに間接的にアクセスするためのもの
	// 値を外部からセットするためのセッター
	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 値を外部からの取得するためのゲッター
	public String getMaker() {
		return this.maker;
	}

	public int getSpeed() {
		return this.speed;
	}

	public String getColor() {
		return this.color;
	}

	// メソッド...そのクラスの振る舞い
	public void showInfo() {
		System.out.println("メーカー：" + this.maker);
		System.out.println("最高速：" + this.speed);
		System.out.println("色：" + this.color);

	}
}
